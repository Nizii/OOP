package ch.hslu.oop.sw10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**

 * @author Nizam.
 */
public class Auto implements Switchable, PropertyChangeListener {
	private boolean autoAn;
	private boolean autoAus;
	private int counts;
	private Motor motor;
	private Licht licht;
	 
	
	/**
	 * Setzt Auto auf aus.
	 */
	public Auto() {
		autoAn = false;
		autoAus = true;
		counts = 0;
		this.motor = new Motor();
		this.licht = new Licht();
		this.motor.addPropertyChangeListener(e -> handleEvent("Motor Event", e));
		this.licht.addPropertyChangeListener(e -> handleEvent("Licht Event", e));
		//licht.switchOn();
		//licht.switchOff();
		//motor.switchOn();
		//motor.switchOff();
	}
	
	/**
	 * Gibt Titel und Event Objekt in Console aus.
	 * @param titel.
	 * @param objekt.
	 */
	public void handleEvent(String titel, Object objekt) {
		System.out.println("Titel = " + titel + "\n" + "Event Object = " + objekt + "\n");
	}
	
	
	@Override
	public void propertyChange(final PropertyChangeEvent event) {
		System.out.println("Es ist ein Event auf " );

		if (event.getSource() == this.motor) {
		//this.handleMotorEvent("Motor", event);
			System.out.println("MOtor hat was gemacht " );
		}
	}

	/** 
	 * Schaltet Auto ein.
	 */
	@Override
	public void switchOn() {
		System.out.println("Auto einschalten");
		autoAn = true;
		autoAus = false;
		motor.switchOn();
		licht.switchOn();
		count();
	}

	/**
	 * Schaltet Auto aus.
	 */
	@Override
	public void switchOff() {
		System.out.println("Auto ausschalten");	
		autoAn = false;
		autoAus = true;
		motor.switchOff();
		licht.switchOff();
		count();
	}

	/**
	 * Überprüft ob Auto an ist.
	 */
	@Override
	public boolean isSwitchedOn() {
		System.out.println("Auto ist an = " + autoAn);
		return autoAn;
	}

	/**
	 * Überprüft ob Auto aus ist.
	 */
	@Override
	public boolean isSwitchedOff() {
		System.out.println("Auto ist aus = " + autoAus);
		return autoAus;
	}
	
	
	/**
	 * inkrementiert.
	 */
	private void count() {
		counts++;
	}

	/**
	 * Gibt Anzahl der Schaltungen zurück.
	 */
	@Override
	public long getSwitchCount() {
		return counts;
	}

	
}
