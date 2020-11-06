package ch.hslu.oop.sw4;

import ch.hslu.oop.sw3.Point;

/**
 * @author nizam.
 * Enthält zwei Punkte der Klasse Point.
 */
public class Linie {
	Point startPunkt;
	Point endPunkt;
	
	/**
	 * @param xStart x für Startpunkt.
	 * @param yStart y für Startpunkt.
	 * @param xEnd für x Endpunkt.
	 * @param yEnd für y Endpunkt.
	 * Initialisiert zwei Objekte der Klasse Point Start und Endpunkt.
	 */
	public Linie (int xStart, int yStart, int xEnd, int yEnd) {
		startPunkt = new Point(xStart, yStart);
		endPunkt = new Point(xEnd, yEnd);
	}
	
	/**
	 * Gibt Startpunkt aus in Konsole x und y Wert.
	 * Dabei greift er auf Getter-Methode (getX und getY) in Klasse Point zu.
	 */
	public void gibStartpunkt() {
		System.out.println(startPunkt.getX() + "/" + startPunkt.getY());
	}
	
	/**
	 * Gibt Endpunkt aus in Konsole x und y Wert.
	 * Dabei greift er auf Getter-Methode (getX und getY) in Klasse Point zu.
	 */
	public void gibEndpunkt() {
		System.out.println(endPunkt.getX() + "/" + endPunkt.getY());
	}
}
