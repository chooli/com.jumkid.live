package com.jumkid.live.flightaware.inflight;

import java.util.Arrays;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.jumkid.live.flightaware.CredentialApplier;

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
public class InFlightInfoHandler {

	private final Log logger = LogFactory.getLog(this.getClass());
	
	private String APIUrl;
	
	private RestTemplate restTemplate;
	
	private CredentialApplier credentialApplier;
	
	/**
	 * Enquire Airline Flight Schedule from flightaware service
	 * 
	 * @param parameters
	 * @return
	 */
	public InFlightInfoResponse request(Map<String, Object> parameters){
		logger.debug("Access api on "+APIUrl);
		
		final HttpHeaders headers = new HttpHeaders();
	    
		headers.add("Authorization", "Basic " + credentialApplier.getAuthorizationBase());
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    		
	    MultiValueMap<String, String> mvm = new LinkedMultiValueMap<String, String>();
	    for (Map.Entry<String, Object> entry : parameters.entrySet()){
			mvm.add(entry.getKey(), entry.getValue().toString());
		}
		@SuppressWarnings("rawtypes")
		HttpEntity<MultiValueMap> entity = new HttpEntity<MultiValueMap>(mvm, headers);

		ResponseEntity<InFlightInfoResponse> response =  restTemplate.exchange(APIUrl, HttpMethod.POST, entity, InFlightInfoResponse.class);
		return response.getBody();
	}

	public String getAPIUrl() {
		return APIUrl;
	}

	public void setAPIUrl(String aPIUrl) {
		APIUrl = aPIUrl;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public CredentialApplier getCredentialApplier() {
		return credentialApplier;
	}

	public void setCredentialApplier(CredentialApplier credentialApplier) {
		this.credentialApplier = credentialApplier;
	}
	
}
