package com.gisfederal.request;
import com.gisfederal.Gaia;
import com.gisfederal.AvroUtils;
import com.gisfederal.GaiaException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.lang.reflect.Field;
import java.lang.Class;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import avro.java.gaia.convex_hull_request;
import avro.java.gaia.register_type_request;

public class CreateTypeRequest extends Request {
	
	// This will build a register type request.  The type definition is an avro schema (json) which is built from the fields of the java class that is passed in. 
	// {"type_definition":"{\\"type\\":\\"record\\",\\"name\\":\\"point\\",\\"fields\\":[{\\"name\\":\\"x\\",\\"type\\":\\"double\\"},{\\"name\\":\\"y\\",\\"type\\":\\"double\\"}]}"}'	
	// NOTE: the annotation should be some attribute in the class or ""
	public CreateTypeRequest(Gaia gaia, String file, Class c, String annotation_attr, String label, String semanticType) throws GaiaException{
		this.gaia = gaia;
		this.file = "/registertype"; 
		this.log = Logger.getLogger(CreateTypeRequest.class);		

		// the name of the object/type
		String name = c.getSimpleName();
		
		// gets all public and private fields in the object
		Field[] fields = c.getDeclaredFields();
		JsonArray json_fields = new JsonArray();
		JsonObject json_field;
		JsonObject json_type_def = new JsonObject();
		
		// type: record, name:..., 
		json_type_def.addProperty("type", "record");
		json_type_def.addProperty("name", name);
		
		// convert Field[] into the correct JsonArray version
		for(int i=0; i<fields.length; i++) {
			// each field has name and type
			json_field = new JsonObject();
			json_field.addProperty("name", fields[i].getName());
			
			// go through adding valid fields
			String fieldTypeName = fields[i].getType().getSimpleName().toLowerCase();
			this.log.debug("fieldTypeName:"+fieldTypeName);
			if(fieldTypeName.equals("bytebuffer")){
				json_field.addProperty("type", "bytes");
			} else if(fieldTypeName.equals("string") || fieldTypeName.equals("double") 
					|| fieldTypeName.equals("int") || fieldTypeName.equals("float") 
					|| fieldTypeName.equals("long")){
				json_field.addProperty("type", fieldTypeName);
			} else {
				log.error("Unsuported java data type:"+fieldTypeName);
				throw new GaiaException("Unsuported java data type:"+fieldTypeName);
			}
			
			json_fields.add(json_field);
		}
		log.debug("FIELDS:"+json_fields.toString());
		
		// add fields
		json_type_def.add("fields", json_fields);
				
		// need to convert the quotation marks into \" in the string
		String str_json_type_def = json_type_def.toString();
		log.debug("json_type_def (Before):"+str_json_type_def);
						
		str_json_type_def.replaceAll("\"", "\\\"");
		log.debug("str_json_type_def (after):"+str_json_type_def);
		
		// build avro object
		register_type_request request = new register_type_request(str_json_type_def, annotation_attr, label, semanticType);
		
		// debug; checking the string encoding of the request
		/*
		if(log.getLevel() == Level.DEBUG) {
			String str_final = AvroUtils.convert_to_string(request);	
			log.debug("Avro encode type request:"+str_final);
		}
		*/
		this.requestData = new RequestData(AvroUtils.convert_to_bytes(request));
		
		// Create log msg for audit
		createAuditMsg(request);
	}
	
	public CreateTypeRequest(Gaia gaia, String file, String definition, String annotation_attr, String label, String semanticType) throws GaiaException{
		this.gaia = gaia;
		this.file = "/registertype"; 
		this.log = Logger.getLogger(CreateTypeRequest.class);		

		// build avro object
		log.debug("definition:"+definition);
		register_type_request request = new register_type_request(definition, annotation_attr, label, semanticType);
		
		this.requestData = new RequestData(AvroUtils.convert_to_bytes(request));
		
		// Create log msg for audit
		createAuditMsg(request);
	}
	
	private void createAuditMsg(register_type_request request) {
		
		StringBuffer msg = new StringBuffer();
		getAuditPart(msg);

		msg.append("[params=[semantic_type=");
		msg.append(request.getSemanticType().toString());
		msg.append("]");
		
		msg.append("[params=[label=");
		msg.append(request.getLabel().toString());
		msg.append("]");
		
		msg.append("[annotation_attr=");
		msg.append(request.getAnnotation().toString());
		msg.append("]]");
		
		setAuditMessage(msg.toString());
	}

}