package com.jumkid.live.flightaware;

import org.apache.commons.codec.binary.Base64;

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

public class CredentialApplier {
	
	private String username;
	
	private String apiKey;
	
	/**
	 * 
	 * @param url
	 * @return
	 */
	public String assembleAPIUrl(String url){
		String _url = url.replaceFirst("http://", "http://"+username+":"+apiKey+"@");
		
		return _url;
	}
	
	/**
	 * Get base64 authorization string
	 * 
	 * @return String
	 */
	public String getAuthorizationBase(){
		String plainCreds = this.getUsername()+":"+this.getApiKey();
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);
		
		return base64Creds;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

}
