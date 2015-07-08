package com.jumkid.live.google.geocoding;

import java.net.URI;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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

public class GeocodingHandler {

	private final Log logger = LogFactory.getLog(this.getClass());
	
	private String APIUrl;
	
	private RestTemplate restTemplate;
	
	/**
	 * Enquire geocoding from google service
	 * 
	 * @param parameters
	 * @return
	 */
	public GeocodingResponse request(Map<String, Object> parameters){
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(APIUrl);
		logger.debug("Access google api on "+builder.toUriString());

		for (Map.Entry<String, Object> entry : parameters.entrySet())
			builder.queryParam(entry.getKey(), entry.getValue());

		URI uri = builder.buildAndExpand(parameters).toUri();

		return restTemplate.getForObject(uri, GeocodingResponse.class);
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
	
	
	
}
