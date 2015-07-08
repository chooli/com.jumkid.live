package test.com.jumkid.live;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.jumkid.base.model.Command;
import com.jumkid.live.google.GoogleAPIService;
import com.jumkid.live.google.geocoding.GeocodingHandler;
import com.jumkid.live.google.geocoding.GeocodingResponse;
import com.jumkid.live.google.geocoding.LatLng;
import com.jumkid.live.google.timezone.TimezoneHandler;
import com.jumkid.live.google.timezone.TimezoneResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
public class MockGoogleAPITest {
	
	@Configuration
    static class ContextConfiguration {
        @Bean
        public GoogleAPIService googleAPIService() throws Exception {
        	GoogleAPIService googleAPIService = new GoogleAPIService();
            // set properties, etc.
        	GeocodingHandler geocodingHandler = new GeocodingHandler();
        	RestTemplate httpRestTemplate = new RestTemplate();
        	geocodingHandler.setRestTemplate(httpRestTemplate);
        	googleAPIService.setGeocodingHandler(geocodingHandler);
        	
        	TimezoneHandler timezoneHandler = new TimezoneHandler();
        	timezoneHandler.setRestTemplate(httpRestTemplate);
        	googleAPIService.setTimezoneHandler(timezoneHandler);
        	
            return googleAPIService;
        }
        
        private ClientHttpRequestFactory clientHttpRequestFactory() {
            HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
            factory.setReadTimeout(2000);
            factory.setConnectTimeout(2000);
            return factory;
        }
        
    }
	
	@Autowired
	private GoogleAPIService googleAPIService;
	
	@Before
	public void setUp(){
		GeocodingHandler geocodingHandler = googleAPIService.getGeocodingHandler();
		geocodingHandler.setAPIUrl("http://maps.googleapis.com/maps/api/geocode/json");
		
		TimezoneHandler timezoneHandler = googleAPIService.getTimezoneHandler();
		timezoneHandler.setAPIUrl("https://maps.googleapis.com/maps/api/timezone/json");
	}

	@Test
	public void testGeocoding() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("address", "Hong Kong");
		
		Command cmd;
		try{
			//Mockito.when(googleAPIService.execute(cmd)).thenReturn(cmd);
			cmd = googleAPIService.execute(new Command("googleApiManager", "geocoding", params));
			GeocodingResponse response = (GeocodingResponse)cmd.getResults().get("response");
			
			assertSame(com.jumkid.live.google.Status.OK, response.getStatus());
			//assertEquals("Hong Kong", response.getResults()[0].getFormattedAddress());
			
			cmd = googleAPIService.execute(new Command("googleApiManager", "loadLatLngByCity", params));
			LatLng latLng = (LatLng)cmd.getResults().get("latLng");
			
			System.out.println("lat: "+latLng.getLat());
			System.out.println("lng: "+latLng.getLng());
			
			assertNotNull(latLng.getLat());
			assertNotNull(latLng.getLng());
			
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}		
		
	}
	
	@Test
	public void testTimezone(){
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("location", "39.904211,116.407395");
		params.put("timestamp", 1331161200);
		
		Command cmd;
		try{
			cmd = googleAPIService.execute(new Command("googleApiManager", "loadTimezoneByLatLng", params));
			TimezoneResponse response = (TimezoneResponse)cmd.getResults().get("response");
									
			assertSame(com.jumkid.live.google.Status.OK, response.getStatus());
			assertNotNull(response.getTimeZoneId());
			
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}		
	}
	
	@Test
	public void testUTCByCity(){
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("address", "Beijing");
		params.put("timestamp", 1331161200);
		
		Command cmd;
		try{
			cmd = googleAPIService.execute(new Command("googleApiManager", "loadUTCByCity", params));
			Integer utcTime = (Integer)cmd.getResults().get("utcTime");
			
			System.out.print("utcTime: "+utcTime);
						
			assertNotNull(utcTime);
			
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}		
	}

}
