package test.com.jumkid.live;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.web.client.RestTemplate;

import com.jumkid.base.model.Command;
import com.jumkid.live.flightaware.CredentialApplier;
import com.jumkid.live.flightaware.PassengerFlightService;
import com.jumkid.live.flightaware.AirportInfo.AirportInfoHandler;
import com.jumkid.live.flightaware.AirportInfo.AirportInfoResult;
import com.jumkid.live.flightaware.inflight.InFlightInfoHandler;
import com.jumkid.live.flightaware.inflight.InFlightInfoResult;
import com.jumkid.live.flightaware.schedules.AirlineFlightSchedulesHandler;
import com.jumkid.live.flightaware.schedules.AirlineFlightSchedulesResult;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=AnnotationConfigContextLoader.class)
public class FlightawareAPITest {

	@Configuration
    static class ContextConfiguration {
		@Bean
        public PassengerFlightService passengerFlightService() throws Exception {
			
			PassengerFlightService passengerFlightService = new PassengerFlightService();
			
			RestTemplate restTemplate = new RestTemplate();
			
			CredentialApplier credentialApplier = new CredentialApplier();
			credentialApplier.setUsername("chooliyip");
			credentialApplier.setApiKey("b6117db250a0aa416c04ea1ff3aba1d54eb19978");
			
			AirlineFlightSchedulesHandler airlineFlightSchedulesHandler = new AirlineFlightSchedulesHandler();
			airlineFlightSchedulesHandler.setRestTemplate(restTemplate);
			airlineFlightSchedulesHandler.setCredentialApplier(credentialApplier);
			
			passengerFlightService.setAirlineFlightSchedulesHandler(airlineFlightSchedulesHandler);			
			
			InFlightInfoHandler inFlightInfoHandler = new InFlightInfoHandler();
			inFlightInfoHandler.setRestTemplate(restTemplate);
			inFlightInfoHandler.setCredentialApplier(credentialApplier);
			
			passengerFlightService.setInFlightInfoHandler(inFlightInfoHandler);
			
			AirportInfoHandler airportInfoHandler = new AirportInfoHandler();
			airportInfoHandler.setRestTemplate(restTemplate);
			airportInfoHandler.setCredentialApplier(credentialApplier);
			
			passengerFlightService.setAirportInfoHandler(airportInfoHandler);
			
			return passengerFlightService;
		}
				
	}
	
	@Autowired
	private PassengerFlightService passengerFlightService;
	
	@Before
	public void setUp(){
		AirlineFlightSchedulesHandler airlineFlightSchedulesHandler = passengerFlightService.getAirlineFlightSchedulesHandler();
		airlineFlightSchedulesHandler.setAPIUrl("http://flightxml.flightaware.com/json/FlightXML2/AirlineFlightSchedules");
		
		InFlightInfoHandler inFlightInfoHandler = passengerFlightService.getInFlightInfoHandler();
		inFlightInfoHandler.setAPIUrl("http://flightxml.flightaware.com/json/FlightXML2/InFlightInfo");
		
		AirportInfoHandler airportInfoHandler = passengerFlightService.getAirportInfoHandler();
		airportInfoHandler.setAPIUrl("http://flightxml.flightaware.com/json/FlightXML2/AirportInfo");
	}
	
	@Test
	public void testAirlineFlightSchedules(){
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("startDate", "1431475200");
		params.put("endDate", "1431561600");
		params.put("airline", "HU");
		params.put("flightno", "7975");
		params.put("howMany", 3);
		params.put("offset", 0);
		
		Command cmd;
		try{
			cmd = passengerFlightService.execute(new Command("flightmanager", "loadAirlineFlightSchedules", params));
			AirlineFlightSchedulesResult airlineFlightSchedules = (AirlineFlightSchedulesResult)cmd.getResults().get("airlineFlightSchedules");
						
			assertTrue("flight schedule data set should has at least 1 item", airlineFlightSchedules.getData().length > 0);
			
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}	
		
	}
	
	@Test
	public void testInFlightInfo(){
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("ident", "HU7975");
		
		Command cmd;
		try{
			cmd = passengerFlightService.execute(new Command("flightmanager", "loadInFlightInfo", params));
			InFlightInfoResult inFlightInfo = (InFlightInfoResult)cmd.getResults().get("inFlightInfo");
			
			System.out.println(inFlightInfo.toJSON());
						
			assertNotNull("flight ID should not be null", inFlightInfo.getFaFlightID());
			
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}	
		
	}
	
	@Test
	public void testAirportInfo(){
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("airportCode", "ZBAA");
		
		Command cmd;
		try{
			cmd = passengerFlightService.execute(new Command("flightmanager", "loadAirportInfo", params));
			AirportInfoResult airportInfo = (AirportInfoResult)cmd.getResults().get("airportInfo");
			
			System.out.println(airportInfo.toJSON());
						
			assertNotNull("location should not be null", airportInfo.getLocation());
			
		}catch(Exception e){
			e.printStackTrace();
			fail(e.getMessage());
		}	
	}

	public PassengerFlightService getPassengerFlightService() {
		return passengerFlightService;
	}

	public void setPassengerFlightService(
			PassengerFlightService passengerFlightService) {
		this.passengerFlightService = passengerFlightService;
	}
	
	
}
