package com.jumkid.live.flightaware.schedules;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSet {
	
	private String ident;
	
	@JsonProperty("actual_ident")
	private String actualIdent;
	
	@JsonProperty("departuretime")
	private Integer departureTime;
	
	@JsonProperty("arrivaltime")
	private Integer arrivalTime;
	
	private String origin;
	
	private String destination;
	
	@JsonProperty("aircrafttype")
	private String aircraftType;
	
	@JsonProperty("meal_service")
	private String mealService;
	
	@JsonProperty("seats_cabin_first")
	private Integer seatsCabinFirst;
	
	@JsonProperty("seats_cabin_business")
	private Integer seatsCabinBusiness;
	
	@JsonProperty("seats_cabin_coach")
	private Integer seatsCabinCoach;

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public String getActualIdent() {
		return actualIdent;
	}

	public void setActualIdent(String actualIdent) {
		this.actualIdent = actualIdent;
	}

	public Integer getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Integer departureTime) {
		this.departureTime = departureTime;
	}

	public Integer getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Integer arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getMealService() {
		return mealService;
	}

	public void setMealService(String mealService) {
		this.mealService = mealService;
	}

	public Integer getSeatsCabinFirst() {
		return seatsCabinFirst;
	}

	public void setSeatsCabinFirst(Integer seatsCabinFirst) {
		this.seatsCabinFirst = seatsCabinFirst;
	}

	public Integer getSeatsCabinBusiness() {
		return seatsCabinBusiness;
	}

	public void setSeatsCabinBusiness(Integer seatsCabinBusiness) {
		this.seatsCabinBusiness = seatsCabinBusiness;
	}

	public Integer getSeatsCabinCoach() {
		return seatsCabinCoach;
	}

	public void setSeatsCabinCoach(Integer seatsCabinCoach) {
		this.seatsCabinCoach = seatsCabinCoach;
	}

}
