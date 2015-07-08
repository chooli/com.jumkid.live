package test.com.jumkid.live;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BasicTests {
		
	@Before
	public void setup(){
		//void
	}
	
	@Test
	public void testOnePlusOne(){
		Integer two = 2;
		assertSame(2, two);
	}

}
