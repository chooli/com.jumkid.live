package com.jumkid.live.google.geocoding;
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

public class Viewport {

	protected LatLng northeast;
	protected LatLng southwest;

	public Viewport() {
	}

	public LatLng getNortheast() {
		return northeast;
	}

	public void setNortheast(LatLng northeast) {
		this.northeast = northeast;
	}

	public LatLng getSouthwest() {
		return southwest;
	}

	public void setSouthwest(LatLng southwest) {
		this.southwest = southwest;
	}
	
}
