package com.jumkid.live.exception;

public class FlightServiceException extends RuntimeException {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1059231671281552997L;

	public FlightServiceException(String errorMsg){
		super(errorMsg);
	}

}
