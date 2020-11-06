package ch.hslu.oop.sw8;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;

public class Start implements PropertyChangeListener {
	private TemperaturVerlauf temperaturVerlauf;
	
	public Start() {
		temperaturVerlauf = new TemperaturVerlauf();
		this.temperaturVerlauf.addPropertyChangeListener(e -> handleEvent("Neue Max/Min Temperatur", e));
	}
	
	/**
	 * Startet Applikation
	 */
	public void start() {
		Scanner scanner = new Scanner(System.in);
		String eingabe;
		do {
			anleitungAusgeben();
			eingabe = scanner.next();
			if (!eingabe.equals("exit")) {
				temperaturVerlauf.add(eingabe);
			}
		} while (!eingabe.equals("exit"));	
		temperaturVerlauf.datenAusgeben();
	}
	
	/**
	 * Gibt Titel und Event Objekt in Console aus.
	 * @param titel.
	 * @param objekt.
	 */
	public void handleEvent(String titel, Object objekt) {
		System.out.println("Titel = " + titel + "\n" + "Event Object = " + objekt + "\n");
	}

	
	public void anleitungAusgeben() {
		System.out.println("Temperatur in Celsius eingeben (Zum beenden 'exit'): ");
	}
	
	@Override
	public void propertyChange(final PropertyChangeEvent event) {

	}

}
