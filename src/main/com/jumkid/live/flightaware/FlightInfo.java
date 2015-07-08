package com.jumkid.live.flightaware;

import java.util.Date;

import com.jumkid.base.model.CommonBean;

public class FlightInfo extends CommonBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7776770707293155753L;

	private String identifier;
	
	private Date departureDate;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	
	
}
