package com.jumkid.live.google.geocoding;

import com.jumkid.live.google.Status;
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
 * VERSION   |  DATE      |  DEVELOPER  | DESC
 * -----------------------------------------------------------------
 * 0.6             May2015       chooli            creation
 *
 */

public class GeocodingResponse {
	
	protected Result[] results;
	protected Status status;

	public GeocodingResponse() {
	}

	public Result[] getResults() {
		return results;
	}

	public void setResults(Result[] results) {
		this.results = results;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
