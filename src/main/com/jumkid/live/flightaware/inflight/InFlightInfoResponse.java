package com.jumkid.live.flightaware.inflight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InFlightInfoResponse {
	
	@JsonProperty("InFlightInfoResult")
	private InFlightInfoResult inFlightInfoResult;

	public InFlightInfoResult getInFlightInfoResult() {
		return inFlightInfoResult;
	}

	public void setInFlightInfoResult(InFlightInfoResult inFlightInfoResult) {
		this.inFlightInfoResult = inFlightInfoResult;
	}
	
	

}
