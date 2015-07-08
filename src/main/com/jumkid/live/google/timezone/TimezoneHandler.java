package com.jumkid.live.google.timezone;

import java.net.URI;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class TimezoneHandler {

	private final Log logger = LogFactory.getLog(this.getClass());
	
	private String APIUrl;
	
	private RestTemplate restTemplate;
	
	/**
	 * Enquire timezone from google service
	 * 
	 * @param parameters
	 * @return
	 */
	public TimezoneResponse request(Map<String, Object> parameters){
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(APIUrl);
		logger.debug("Access google api on "+builder.toUriString());

		for (Map.Entry<String, Object> entry : parameters.entrySet())
			builder.queryParam(entry.getKey(), entry.getValue());

		URI uri = builder.buildAndExpand(parameters).toUri();

		return restTemplate.getForObject(uri, TimezoneResponse.class);
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
