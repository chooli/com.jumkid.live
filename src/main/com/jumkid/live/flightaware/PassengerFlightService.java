package com.jumkid.live.flightaware;

import com.jumkid.base.model.AbstractCommandService;
import com.jumkid.base.model.Command;
import com.jumkid.live.flightaware.AirportInfo.AirportInfoHandler;
import com.jumkid.live.flightaware.AirportInfo.AirportInfoResponse;
import com.jumkid.live.flightaware.inflight.InFlightInfoHandler;
import com.jumkid.live.flightaware.inflight.InFlightInfoResponse;
import com.jumkid.live.flightaware.schedules.AirlineFlightSchedulesHandler;
import com.jumkid.live.flightaware.schedules.AirlineFlightSchedulesResponse;

/* 
 * This software is written by Jumkid Innovation. and subject
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

public class PassengerFlightService extends AbstractCommandService implements IPassengerFlightService {
	
	private AirlineFlightSchedulesHandler airlineFlightSchedulesHandler;
	
	private InFlightInfoHandler inFlightInfoHandler;
	
	private AirportInfoHandler airportInfoHandler;	

	@Override
    public Command execute(Command cmd) throws Exception{
        super.execute(cmd);
        
        try{
        	if (isManager("flightmanager")) {
                
                if (isAction("loadAirlineFlightSchedules")) {
                	AirlineFlightSchedulesResponse response = airlineFlightSchedulesHandler.request(cmd.getParams());
                	cmd.addResults("airlineFlightSchedules", response.getAirlineFlightSchedulesResult());
                }else
                if(isAction("loadInFlightInfo")){
                	InFlightInfoResponse response = inFlightInfoHandler.request(cmd.getParams());
                	cmd.addResults("inFlightInfo", response.getInFlightInfoResult());
                }else
                if(isAction("loadAirportInfo")){
                	AirportInfoResponse response = airportInfoHandler.request(cmd.getParams());
                	cmd.addResults("airportInfo", response.getAirportInfoResult());
                }
                
        	}
        	
        }catch(Exception e){
        	logger.error("failed to perform "+cmd.getAction()+" due to "+e.getMessage());
            cmd.setError(e.getLocalizedMessage());
        }
        
        return cmd;
		
	}
	
	private String extractAirline(String identifier){
		return identifier.replaceAll("[0-9]+", "");
	}
	
	private String extractFlightno(String identifier){
		return identifier.toUpperCase().replaceAll("[A-Z]+", "");
	}

	public AirlineFlightSchedulesHandler getAirlineFlightSchedulesHandler() {
		return airlineFlightSchedulesHandler;
	}

	public void setAirlineFlightSchedulesHandler(
			AirlineFlightSchedulesHandler airlineFlightSchedulesHandler) {
		this.airlineFlightSchedulesHandler = airlineFlightSchedulesHandler;
	}

	public InFlightInfoHandler getInFlightInfoHandler() {
		return inFlightInfoHandler;
	}

	public void setInFlightInfoHandler(InFlightInfoHandler inFlightInfoHandler) {
		this.inFlightInfoHandler = inFlightInfoHandler;
	}
	
	public AirportInfoHandler getAirportInfoHandler() {
		return airportInfoHandler;
	}

	public void setAirportInfoHandler(AirportInfoHandler airportInfoHandler) {
		this.airportInfoHandler = airportInfoHandler;
	}

}
