package com.jumkid.live.google.timezone;

import com.jumkid.live.google.Status;

public class TimezoneResponse {
	
	private Integer dstOffset;
     
	private Integer rawOffset;
    
    private Status status;
    
    private String timeZoneId;
    
    private String timeZoneName;

	public Integer getDstOffset() {
		return dstOffset;
	}

	public void setDstOffset(Integer dstOffset) {
		this.dstOffset = dstOffset;
	}

	public Integer getRawOffset() {
		return rawOffset;
	}

	public void setRawOffset(Integer rawOffset) {
		this.rawOffset = rawOffset;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public String getTimeZoneName() {
		return timeZoneName;
	}

	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}

}
