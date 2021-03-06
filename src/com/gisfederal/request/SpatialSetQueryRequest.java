package com.gisfederal.request;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import avro.java.gpudb.spatial_set_query_request;

import com.gisfederal.AvroUtils;
import com.gisfederal.GPUdb;
import com.gisfederal.SetId;

public class SpatialSetQueryRequest extends Request {
	public SpatialSetQueryRequest(GPUdb gPUdb, String file, List<SetId> set_ids, CharSequence wkt_attr_name, CharSequence wkt_string, CharSequence operation) {
		this.gPUdb = gPUdb;
		this.file = file;
		this.log = Logger.getLogger(SpatialSetQueryRequest.class);
		
		List<CharSequence> ids = new ArrayList<CharSequence>();
		for(SetId id : set_ids) {
			ids.add(id.toString());
		}
		spatial_set_query_request request = new spatial_set_query_request(ids, wkt_attr_name, wkt_string, operation, gPUdb.getUserAuth()); 
		this.requestData = new RequestData(AvroUtils.convert_to_bytes(request));
	
		// Create log msg for audit
		createAuditMsg(request);
	}

	private void createAuditMsg(spatial_set_query_request request) {
		StringBuffer msg = new StringBuffer();
		getAuditPart(msg);

		msg.append("[params=[setids=");
		msg.append(request.getSetIds().toString());
		msg.append("]]");
		
		setAuditMessage(msg.toString());
	}

}
