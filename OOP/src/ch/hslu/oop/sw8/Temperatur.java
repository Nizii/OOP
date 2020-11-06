package ch.hslu.oop.sw8;

import java.util.Objects;


/**
 * autor nizam.
 * In der Klasse werden die Themperaturwerte Celsius, Fahrenheit und Kelvin umgerechnet.
 * Die Klasse enthält einen Datentyp "celsius" und eine ArrayList die das Objekt Element enthalten kann
 */
public final class Temperatur implements Comparable<Temperatur> {
		
	private static final float CELSIUS_OFFSET = -273.15f;
	private static final float KELVIN_OFFSET = 0f;
	private final float celsius;
	
	/**
	 *  Konstruktor setzt Wert Celsius auf 20 Grad.
	 */
	private Temperatur() {
		celsius = round(20f);
	}
	
	/**
	 * @param celsius Setzt die Anfangstemperatur des Objekts in Celsius.
	 */
	Temperatur(float celsius) {
		this.celsius = round(celsius);
	}
	
	/**
	 * Factory Methode verhindert Direktzugriff auf Konstruktor.
	 * @param celsius.
	 * @return erstellt Temperatur Objekt.
	 */
	public static Temperatur createFromCelsius(final float celsius) throws IllegalArgumentException {
		if(CELSIUS_OFFSET > celsius) {
			throw new IllegalArgumentException("Temperatureingabe zu tief");
		}
		return new Temperatur(celsius);
	}
	
	/**
	 * Factory Methode verhindert Direktzugriff auf Konstruktor.
	 * @param kelvin.
	 * @return erstellt Temperatur Objekt.
	 */
	public static Temperatur createFromKelvin(final float kelvin) throws IllegalArgumentException{
		if(CELSIUS_OFFSET - 273.15 > kelvin) {
			throw new IllegalArgumentException("Temperatureingabe zu tief");
		}
		return new Temperatur(convertKelvinToCelsius(kelvin));
	}
	
	/**
	 * @return gibt aktuelle Temperatur Zurück.
	 */
	public float getCelsius() {
		return celsius;
	}

	/**
	 * @param celsius übergibt aktuelle Temperatur in Celsius.
	 * @return Gibt umgerechneten Wert in Kelvin zurück.
	 */
	public static float convertCelsiusToKelvin(float celsius) {
		return celsius - CELSIUS_OFFSET;
	}
	
	/**
	 * @param kelvin übergibt aktuelle Temperatur in Kelvin.
	 * @return Gibt umgerechneten Wert in Celsius zurück.
	 */
	public static float convertKelvinToCelsius(float kelvin) {
		return kelvin +- CELSIUS_OFFSET;
	}
	
	/**
	 * @return berechnet Celsius zu Kelvin.
	 */
	public float celsiusToCelvin() {
		return round(convertCelsiusToKelvin(celsius));
	}
	
	/**
	 * @return berechnet Celsius zu Fahrenheit.
	 */
	public float celsiusToFahrenheit() {
		return round(celsius * 1.8f) + 32f;
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
	 * Vergleicht Werte des Objects ob kleiner oder grösser -1 0 und 1.
	 */
	@Override
	public int compareTo(Temperatur other) {
		return Float.compare(this.celsius, other.celsius);
	}
	
	/**
	 * Gibt Hashwert von Datentyp Celsius aus.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.celsius);
	}
	
	/**
	 * Vergleicht.
	 */
	public boolean equals(final Object object) {
		if (this == object){
			return true;
		}
		if (!(object instanceof Temperatur)) {
			return false;
		}
		final Temperatur other = (Temperatur) object;
		return (other.celsius == this.celsius);
	}
	
}
