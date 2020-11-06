package ch.hslu.oop.sw7;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

class PersonJUnit {
	@DisplayName("Vergleicht Vorname") 
	@Test
	void konstruktorTest1() {
		Person p = new Person("Nizam", "Özdemir", 1);
		assertEquals("Nizam", p.getVorname());
	}
	
	@DisplayName("Vergleicht Nachname") 
	@Test
	void konstruktorTest2() {
		Person p = new Person("Nizam", "Özdemir", 1);
		assertEquals("Özdemir", p.getNachname());
	}
	
	@DisplayName("Vergleicht ID") 
	@Test
	void konstruktorTest3() {
		Person p = new Person("Nizam", "Özdemir", 1);
		assertEquals(1, p.getID());
	}
	
	@DisplayName("Überprüft ob ID 0 oder kleiner ist") 
	@Test
	void konstruktorTest4() {
		Person p = new Person("Nizam", "Özdemir", 1);
		assertFalse(p.getID() <= 0);
	}
	
	// Vergleicht zwei Person Objekte mit welche die selben Werte enthalten
	// Erwartet Fehler = true
	@DisplayName("Vergleicht zwei versch. Obj mit selben Werten") 
	@Test 
	void objektTest1() {
		Person p1 = new Person("Nizam", "Özdemir", 1);
		Person p2 = p1;// = new Person("Nizam", "Özdemir", 1);
		assertFalse(p1.equals(p2));
	}
	
	// Vergleicht ein Objekt mit sich selber
	// Der Test wird true
	@DisplayName("Vergleicht Obj. mit sich selber") 
	@Test 
	void objektTest2() {
		Person p1 = new Person("Nizam", "Özdemir", 1);
		assertEquals(p1,p1);
	}
	
	// Vergleicht Nachname von zwei verschiedenen Objekten welche den selben Wert enthalten
	// Der Test wird true
	@DisplayName("Vergleicht Nachname von zwei versch. Obj. mit selben Wert") 
	@Test 
	void test3() {
		Person p1 = new Person("Nizam", "Özdemir", 1);
		Person p2 = new Person("Nizam", "Özdemir", 1);
		assertEquals(p2.getNachname(),p1.getNachname());
	}
	
	/*
	@Test
	void equalsContract() {
		EqualsVerifier.forClass(Person.class).verify();
	}
	*/
	
	@DisplayName("Vergleicht HashCode vom selben Obj.") 
	@Test
	public void hashtest1() {
		Person p1 = new Person("Nizam", "Özdemir", 1);
	    Assert.assertTrue(p1.equals(p1));
	    assertTrue(p1.hashCode() == p1.hashCode());
	}
	
	@DisplayName("Vergleicht HashCode von zwei verschidenen Obj.") 
	@Test
	public void hashTest2() {
		Person p1 = new Person("Nizam", "Özdemir", 1);
		Person p2 = new Person("Nizam", "Özdemir", 1);
	    assertFalse(p1.hashCode() == p2.hashCode());
	}

}
