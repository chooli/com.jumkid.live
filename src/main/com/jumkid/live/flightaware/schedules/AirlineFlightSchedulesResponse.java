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
public class AirlineFlightSchedulesResponse {

	@JsonProperty("AirlineFlightSchedulesResult")
	private AirlineFlightSchedulesResult airlineFlightSchedulesResult;

	public AirlineFlightSchedulesResult getAirlineFlightSchedulesResult() {
		return airlineFlightSchedulesResult;
	}

	public void setAirlineFlightSchedulesResult(
			AirlineFlightSchedulesResult airlineFlightSchedulesResult) {
		this.airlineFlightSchedulesResult = airlineFlightSchedulesResult;
	}
		
}
