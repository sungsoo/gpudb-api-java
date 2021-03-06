/**
 * 
 */
package com.gisfederal.request;
import com.gisfederal.GPUdb;
import com.gisfederal.AvroUtils;
import com.gisfederal.SetId;

import java.util.List;

import org.apache.log4j.Logger;

import avro.java.gpudb.filter_by_set_request;
import avro.java.gpudb.filter_by_string_request;


public class FilterByStringRequest extends Request {

	public FilterByStringRequest (GPUdb gPUdb, String file, String expression, String mode, List<CharSequence> options, SetId in_set_id, List<CharSequence> attributes, SetId result_set_id) {  
			
		this.gPUdb = gPUdb;
		this.file = file;		
		this.log = Logger.getLogger(FilterByStringRequest.class);
		
		
		this.log.debug("gpudb:"+gPUdb.toString()+" in_set:"+in_set_id.get_id());
		filter_by_string_request request = new filter_by_string_request(expression, mode, options, in_set_id.get_id(), attributes, 
				result_set_id.get_id(), this.gPUdb.getUserAuth()); 
		
		this.log.debug("Build request object");

		this.requestData = new RequestData(AvroUtils.convert_to_bytes(request));

		// Create log msg for audit
		createAuditMsg(request);
	}
	
	private void createAuditMsg(filter_by_string_request request) {
		StringBuffer msg = new StringBuffer();
		getAuditPart(msg);

		msg.append("[params=[setid=");
		msg.append(request.getSetId().toString());
		msg.append("]]");

		setAuditMessage(msg.toString());
	}

}
