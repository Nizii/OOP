package ch.hslu.oop.sw8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitTestTemperaturVerlauf {

	@DisplayName("Testet ob index >= 0 ist") 
	@Test
	void getCountTest1() {
		TemperaturVerlauf t = new TemperaturVerlauf();
		assertTrue(t.getCount() >= 0);
	}
	
	@DisplayName("Testet ob index < 0 ist") 
	@Test
	void getCountTest2() {
		TemperaturVerlauf t = new TemperaturVerlauf();
		assertFalse(t.getCount() < 0);
	}
}