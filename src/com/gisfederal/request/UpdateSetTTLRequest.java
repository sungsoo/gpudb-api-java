package com.gisfederal.request;

import org.apache.log4j.Logger;

import avro.java.gaia.sort_request;
import avro.java.gaia.update_set_ttl_request;

import com.gisfederal.AvroUtils;
import com.gisfederal.Gaia;
import com.gisfederal.SetId;

public class UpdateSetTTLRequest extends Request {

	public UpdateSetTTLRequest(Gaia gaia, String file, SetId set_id, int ttl) {
		this.gaia = gaia;
		this.file = file;
		this.log = Logger.getLogger(UpdateSetTTLRequest.class);
					
		update_set_ttl_request request = new update_set_ttl_request(set_id.get_id(), ttl);	
		
		this.log.debug("Build request object");
		this.requestData = new RequestData(AvroUtils.convert_to_bytes(request));
	
		// Create log msg for audit
		createAuditMsg(request);
	}

	private void createAuditMsg(update_set_ttl_request request) {
		StringBuffer msg = new StringBuffer();
		getAuditPart(msg);

		msg.append("[params=[setid=");
		msg.append(request.getSetId().toString());
		msg.append("]]");
		
		setAuditMessage(msg.toString());
	}

}