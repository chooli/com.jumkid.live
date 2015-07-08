package com.jumkid.live.google;
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

import com.jumkid.base.model.AbstractCommandService;
import com.jumkid.base.model.Command;
import com.jumkid.base.model.IServerService;
import com.jumkid.live.google.geocoding.GeocodingHandler;
import com.jumkid.live.google.geocoding.GeocodingResponse;
import com.jumkid.live.google.geocoding.LatLng;
import com.jumkid.live.google.timezone.TimezoneHandler;
import com.jumkid.live.google.timezone.TimezoneResponse;


public class GoogleAPIService extends AbstractCommandService implements IServerService{
	
	protected GeocodingHandler geocodingHandler;

	protected TimezoneHandler timezoneHandler;
	
	@Override
	public Command execute(Command cmd) throws Exception {
		super.execute(cmd);
        
        try{
        	if (isManager("googleApiManager")) {
        		
                if (isAction("geocoding")) {
                	GeocodingResponse response = geocodingHandler.request(cmd.getParams());
                	cmd.addResults("response", response);
                }else
            	if(isAction("loadLatLngByCity")){
            		GeocodingResponse response = geocodingHandler.request(cmd.getParams());
            		LatLng latLng = response.getResults()[0].getGeometry().getLocation();
            		cmd.addResults("latLng", latLng);
            	}else
            	if(isAction("loadTimezoneByLatLng")){
            		TimezoneResponse response = this.getTimezoneHandler().request(cmd.getParams());
            		cmd.addResults("response", response);
            	}else
            	//this service will get UTC time by give param [address, timestamp]	
            	if(isAction("loadUTCByCity")){
            		int ts = (int)cmd.getParams().get("timestamp");
            		GeocodingResponse gResponse = geocodingHandler.request(cmd.getParams());
            		LatLng latLng = gResponse.getResults()[0].getGeometry().getLocation();
            		cmd.getParams().put("location", latLng.getLat()+","+latLng.getLng());
            		
            		TimezoneResponse tResponse = this.getTimezoneHandler().request(cmd.getParams());
            		Integer utcTs = ts - tResponse.getRawOffset();
            		cmd.addResults("utcTime", utcTs);
            	}
                
        	}
        	
        }catch(Exception e){
        	e.printStackTrace();
        	logger.error("failed to perform "+cmd.getAction()+" due to "+e.getMessage());
            cmd.setError(e.getLocalizedMessage());
        }
        
        return cmd;
	}

	public GeocodingHandler getGeocodingHandler() {
		return geocodingHandler;
	}

	public void setGeocodingHandler(GeocodingHandler geocodingHandler) {
		this.geocodingHandler = geocodingHandler;
	}

	public TimezoneHandler getTimezoneHandler() {
		return timezoneHandler;
	}

	public void setTimezoneHandler(TimezoneHandler timezoneHandler) {
		this.timezoneHandler = timezoneHandler;
	}

}
