package com.jumkid.live.google.geocoding;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {

	protected LatLng location;

	@JsonProperty("location_type")
	protected LocationType locationType;

	protected Viewport viewport;

	public Geometry() {
	}

	public LatLng getLocation() {
		return location;
	}

	public void setLocation(LatLng location) {
		this.location = location;
	}

	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	public Viewport getViewport() {
		return viewport;
	}

	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}
	
}
