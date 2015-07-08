package com.jumkid.live.flightaware.schedules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* 
 * This software is written by Jumkid Ltd. and subject
 * to a contract between Jumkid and its customer.
 *
 * This software stays property of Jumkid unless differing
 * arrangements between Jumkid and its customer apply.
 *
 * 
 * http://www.jumkid.com
 * mailto:info@jumkid.com
 *
 * (c)2014 Jumkid Innovation. All rights reserved.
 *
 */

@JsonIgnoreProperties(ignoreUnknown=true)
public class AirlineFlightSchedulesResult {

	@JsonProperty("next_offset")
	private Integer nextOffset;
	
	@JsonProperty("data")
	private DataSet[] data;

	public int getNextOffset() {
		return nextOffset;
	}

	public void setNextOffset(Integer nextOffset) {
		this.nextOffset = nextOffset;
	}

	public DataSet[] getData() {
		return data;
	}

	public void setData(DataSet[] data) {
		this.data = data;
	}	
	
}
