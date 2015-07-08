package com.jumkid.live.flightaware.inflight;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jumkid.base.model.CommonBean;
import com.jumkid.base.util.Formatter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InFlightInfoResult extends CommonBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6211317090886660912L;

	private String 	faFlightID;
	
	private String 	ident;
	
	private String 	prefix;
	
	private String 	type;
	
	private String 	suffix;
	
	private String 	origin;
	
	private String 	destination;
	
	private String 	timeout;
	
	private Timestamp timestamp;
	
	private String timestampDatetime;
	
	private Timestamp 	departureTime;
	
	private String departureDatetime;
	
	private Timestamp 	firstPositionTime;
	
	private String firstPositionDateTime;
	
	private Timestamp 	arrivalTime;
	
	private String arrivalDatetime;
	
	private Double longitude;
	
	private Double	latitude;
	
	private Double lowLongitude;
	
	private Double lowLatitude;
	
	private Double	highLongitude;
	
	private Double	highLatitude;
	
	private Integer groundspeed;
	
	private Integer altitude;
	
	private Integer heading;
	
	private String altitudeStatus;
	
	private String updateType;
	
	private String altitudeChange;
	
	private String waypoints;

	public String getFaFlightID() {
		return faFlightID;
	}

	public void setFaFlightID(String faFlightID) {
		this.faFlightID = faFlightID;
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
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

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Timestamp getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}

	public Timestamp getFirstPositionTime() {
		return firstPositionTime;
	}

	public void setFirstPositionTime(Timestamp firstPositionTime) {
		this.firstPositionTime = firstPositionTime;
	}

	public Timestamp getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
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

	public Double getLowLongitude() {
		return lowLongitude;
	}

	public void setLowLongitude(Double lowLongitude) {
		this.lowLongitude = lowLongitude;
	}

	public Double getLowLatitude() {
		return lowLatitude;
	}

	public void setLowLatitude(Double lowLatitude) {
		this.lowLatitude = lowLatitude;
	}

	public Double getHighLongitude() {
		return highLongitude;
	}

	public void setHighLongitude(Double highLongitude) {
		this.highLongitude = highLongitude;
	}

	public Double getHighLatitude() {
		return highLatitude;
	}

	public void setHighLatitude(Double highLatitude) {
		this.highLatitude = highLatitude;
	}

	public Integer getGroundspeed() {
		return groundspeed;
	}

	public void setGroundspeed(Integer groundspeed) {
		this.groundspeed = groundspeed;
	}

	public Integer getAltitude() {
		return altitude;
	}

	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}

	public Integer getHeading() {
		return heading;
	}

	public void setHeading(Integer heading) {
		this.heading = heading;
	}

	public String getAltitudeStatus() {
		return altitudeStatus;
	}

	public void setAltitudeStatus(String altitudeStatus) {
		this.altitudeStatus = altitudeStatus;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public String getAltitudeChange() {
		return altitudeChange;
	}

	public void setAltitudeChange(String altitudeChange) {
		this.altitudeChange = altitudeChange;
	}

	public String getWaypoints() {
		return waypoints;
	}

	public void setWaypoints(String waypoints) {
		this.waypoints = waypoints;
	}

	public String getTimestampDatetime() {
		if(timestampDatetime==null){
			try{
				timestampDatetime = Formatter.timestampToString(this.getTimestamp(), Formatter.yyyy_MM_dd_HH_mm_ss);
			}catch(Exception e){
				//void
			}
		}
		return timestampDatetime;
	}

	public void setTimestampDatetime(String timestampDatetime) {
		this.timestampDatetime = timestampDatetime;
	}

	public String getDepartureDatetime() {
		if(departureDatetime==null){
			try{
				departureDatetime = Formatter.timestampToString(this.getDepartureTime(), Formatter.yyyy_MM_dd_HH_mm_ss);
			}catch(Exception e){
				//void
			}
		}
		return departureDatetime;
	}

	public void setDepartureDatetime(String departureDatetime) {
		this.departureDatetime = departureDatetime;
	}

	public String getFirstPositionDateTime() {
		if(firstPositionDateTime==null){
			try{
				firstPositionDateTime = Formatter.timestampToString(this.getFirstPositionTime(), Formatter.yyyy_MM_dd_HH_mm_ss);
			}catch(Exception e){
				//void
			}
		}
		return firstPositionDateTime;
	}

	public void setFirstPositionDateTime(String firstPositionDateTime) {
		this.firstPositionDateTime = firstPositionDateTime;
	}

	public String getArrivalDatetime() {
		if(arrivalDatetime==null){
			try{
				arrivalDatetime = Formatter.timestampToString(this.getArrivalTime(), Formatter.yyyy_MM_dd_HH_mm_ss);
			}catch(Exception e){
				//void
			}
		}
		return arrivalDatetime;
	}

	public void setArrivalDatetime(String arrivalDatetime) {
		this.arrivalDatetime = arrivalDatetime;
	}
	
}
