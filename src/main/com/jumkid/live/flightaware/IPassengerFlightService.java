package com.jumkid.live.flightaware;

import com.jumkid.base.model.Command;

public interface IPassengerFlightService {

	/**
     * 
     * @param cmd
     * @return
     * @throws Exception
     */
    public Command execute(Command cmd) throws Exception;

    
}
