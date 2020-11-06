package ch.hslu.oop.sw8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class JUnitTestTemperatur {

	@DisplayName("Testet ob Temperatureingabe korrekt ist") 
	@Test
	void test1() {
		Temperatur t = Temperatur.createFromCelsius(-273.15f);
		assertTrue(t.getCelsius() <= -273.15f);
	}
	
	@DisplayName("Testet ob IllegalArgumentException auslöst bei Objekterzeugung") 
	@Test
	void testException() {
		final Exception e = assertThrows(IllegalArgumentException.class, () -> {
			Temperatur.createFromCelsius(-1000);
		});
		assertEquals("Temperatureingabe zu tief", e.getMessage());
	}	
}
