package ch.hslu.oop.sw2;

import java.util.ArrayList;

/**
 * autor nizam.
 * In der Klasse werden die Themperaturwerte Celsius, Fahrenheit und Kelvin umgerechnet.
 * Die Klasse enthält einen Datentyp "celsius" und eine ArrayList die das Objekt Element enthalten kann
 */
public class Temperatur {
	private float celsius;
	private ArrayList<Element> elementList;
	
	/**
	 *  Konstruktor setzt Wert Celsius auf 20 Grad.
	 */
	public Temperatur() {
		celsius = round(20f);
		elementList = new ArrayList<>();
		fillElementList();
	}
	
	/**
	 * @param celsius Setzt die Anfangstemperatur des Objekts in Celsius.
	 */
	public Temperatur(float celsius) {
		this.celsius = round(celsius);
		elementList = new ArrayList<>();
		fillElementList();
	}
	
	/**
	 * @return gibt Celsius als Floatwert zurück.
	 */
	public float getCelsius() {
		return round(celsius);
	}
	
	/**
	 * @param setzt Celsius.
	 */
	public void setGradcelsius(float celsius) {
		this.celsius = celsius;
	}
	
	/**
	 * @param input erhöht Celsius.
	 */
	public void addCelsius(float input) {
		celsius =+ input;
	}
	
	/**
	 * @return berechnet Celsius zu Kelvin.
	 */
	public float celsiusToCelvin() {
		return round(celsius + 273.15f);
	}
	
	/**
	 * @return berechnet Celsius zu Fahrenheit.
	 */
	public float celsiusToFahrenheit() {
		return round(celsius * 1.8f) + 32f;
	}
	
	/**
	 * @param input erhöht Temperatur Celsius mit Fahrenheit.
	 */
	public void fahrenheitInput(float input) {
		celsius = input - 32f / 1.8f;
	}
	
	/**
	 * @param input erhöht Temperatur Celsius mit Kelvin.
	 */
	public void celvintInput(float input) {
		celsius = input - 273.15f;
	}
	
	/**
	 * Gibt alle Werte in Konsole aus.
	 */
	public void printOut() {
		System.out.println("Celsius " + celsius);
		System.out.println("Fahrenheit " + celsiusToFahrenheit());
		System.out.println("Celvin " + celsiusToCelvin());
	}
	
	/**
	 * Rundet auf zwei Stellen nach Komma.
	 * @param erhält Wert ungerundetet.
	 * @return gibt gerundeten Wert zurück.
	 */
	private float round(float value) {
		return Math.round(value * 100) / 100f;
	}
	
	/**
	 * Füllt ArrayList mit Elementobjekten.
	 */
	private void fillElementList() {
		elementList.add(new Blei());
		elementList.add(new Quecksilber());
		elementList.add(new Stickstoff());
	}
	
	/**
	 * Gibt den status des Elements aus zur aktuellen Temperatur.
	 * @param element ist das Element von dem der Status ausgegeben werden soll.
	 */
	public void getPhysicalstate(String element) { 
		for(int i = 0; i < elementList.size(); i++) {
			Element e = elementList.get(i);
			if(e.getName().equals(element)) {
				if(celsius > e.getMeltingpoint() && celsius < e.getBoilingpoint()) {
					System.out.println(e.getName() + " flüssig");
				} else if (celsius >= e.getBoilingpoint()){
					System.out.println(e.getName() + " gasförmig");
				} else {
					System.out.println(e.getName() + " fest");
				}
			}
		}
	}
	
	
}
