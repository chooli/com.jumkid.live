package com.jumkid.live.flightaware.AirportInfo;

import com.jumkid.base.model.CommonBean;

public class AirportInfoResult extends CommonBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = -54836457875063364L;
	
	private String name;
	
	private String location;
	
	private Double longitude;
	
	private Double latitude;
	
	private String timezone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	

}
