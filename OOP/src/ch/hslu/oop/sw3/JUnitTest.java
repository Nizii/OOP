package ch.hslu.oop.sw3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitTest {
	// @Test @Disable @BeforeAll @ BeforeEach @AfterEach @ AfterAll

	// Überprüft ob der höchste Wert zurückgegeben wird
	@Test
	
	//@DisplayName zeigt statt Name der Funktion diesen ("Text")
	@DisplayName("Vergleicht Wert 4") 
	void test1() {
		Demo d = new Demo();
		assertTrue(d.intMax(3, 4) == 4 );
	}

	// Überprüft ob der tiefere Wert ausgegeben wird
	@Test
	void test3() {
		Demo d = new Demo();
		assertFalse(d.intMax(30, 3) == 30);
	}
	
	// Überprüft ob der höchste Wert ausgegeben wird
	@Test
	void test4() {
		Demo d = new Demo();
		assertEquals(7,d.intMax(5, 7));
	}
	
	

}
