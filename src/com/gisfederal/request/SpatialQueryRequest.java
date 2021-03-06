package com.gisfederal.request;

import org.apache.log4j.Logger;

import avro.java.gpudb.select_request;
import avro.java.gpudb.spatial_query_request;

import com.gisfederal.AvroUtils;
import com.gisfederal.GPUdb;

public class SpatialQueryRequest extends Request {
	public SpatialQueryRequest(GPUdb gPUdb, String file, CharSequence wkt1, CharSequence wkt2, CharSequence operation) {
		this.gPUdb = gPUdb;
		this.file = file;
		this.log = Logger.getLogger(SpatialQueryRequest.class);
		
		spatial_query_request request = new spatial_query_request(wkt1, wkt2, operation);
		this.requestData = new RequestData(AvroUtils.convert_to_bytes(request));
	
		// Create log msg for audit
		createAuditMsg(request);
	}

	private void createAuditMsg(spatial_query_request request) {
		StringBuffer msg = new StringBuffer();
		getAuditPart(msg);

		msg.append("[params=[wktstring_1=");
		msg.append(request.getWktString1());
		msg.append("]");
		
		msg.append("[wktstring_2=");
		msg.append(request.getWktString2());
		msg.append("]]");

		
		setAuditMessage(msg.toString());
	}


}
