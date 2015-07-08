package com.jumkid.live.flightaware.AirportInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirportInfoResponse {
	
	@JsonProperty("AirportInfoResult")
	private AirportInfoResult airportInfoResult;

	public AirportInfoResult getAirportInfoResult() {
		return airportInfoResult;
	}

	public void setAirportInfoResult(AirportInfoResult airportInfoResult) {
		this.airportInfoResult = airportInfoResult;
	}

}
