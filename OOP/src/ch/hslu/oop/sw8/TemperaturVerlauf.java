package ch.hslu.oop.sw8;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import ch.hslu.oop.sw10.MotorStatus;

public class TemperaturVerlauf {
	private List<Temperatur> list;	
	private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
	private MaxMinEnum maxMinEnum;

	
	public TemperaturVerlauf() {
		list = new ArrayList<>();	}
	
	/**
	 * Fügt Temperaturobjekt in Liste hinzu.	
	 * @param eingabe wird von String zu Float umgewandelt.
	 */
	public void add(String eingabe) {
		try {
			list.add(Temperatur.createFromCelsius(Float.valueOf(eingabe.trim()).floatValue()));
			eventErstellen(Float.valueOf(eingabe.trim()).floatValue());
		} catch (NumberFormatException exception) {
			System.err.println("Es wurde keine Zahl eingegeben: " + exception.getMessage());
		}
	}
		
	/**
	 * Leert die Liste.
	 */
	public void clear() {
		list.clear();
	}
	
	/**
	 * @return Gibt Anzahl Objecte zurück.
	 */
	public int getCount() {
		return list.size();
	}
	
	/**
	 * @return Gibt maximale Temperatur zurück.
	 */
	public float getMaxTemp() {
		float max = list.get(0).getCelsius();
		for(Temperatur t: list) {
			if (t.getCelsius() > max) {
				max = t.getCelsius();
			}
		}
		return max;
	}
	
	/**
	 * @return Gibt minimale Temperatur zurück.
	 */
	public float getMinTemp() {
		float min = list.get(0).getCelsius();
		for(Temperatur t: list) {
			if (t.getCelsius() < min) {
				min = t.getCelsius();
			}
		}
		return min;
	}
	
	/**
	 * @return Gibt Durchnittstemperatur aller Objekte zurück.
	 */
	public float getAvgTemp() {
		float avgTemp = 0f;
		for(Temperatur t: list) {
			avgTemp = avgTemp + t.getCelsius(); 
			}
		return round(avgTemp / list.size());
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
	* Informiert alle PropertyChangeListeners über PropertyChangeEvent.
	* @param pcEvent PropertyChangeEvent.
	*/
	private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
		for (final PropertyChangeListener listener : this.changeListeners) {
			listener.propertyChange(pcEvent);
		}
	}
	
	/**
	* Registriert einen PropertyChangeListener.
	* @param listener PropertyChangeListener.
	*/
	public void addPropertyChangeListener(final PropertyChangeListener listener) {
		this.changeListeners.add(listener);
	}
	
	/**
	* Deregistriert einen PropertyChangeListener.
	* @param listener PropertyChangeListener.
	*/
	public void removePropertyChangeListener(final PropertyChangeListener listener) {
		this.changeListeners.remove(listener);
	}
	
	/**
	 * Macht Fallunterscheidung und erstellt Event.
	 * @param eingabe Max oder Minwert.
	 */
	public void eventErstellen(float eingabe) {
		if (eingabe >= getMaxTemp()) {
			this.maxMinEnum = MaxMinEnum.MAX;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "maxMinEnum", MaxMinEnum.NEU, MaxMinEnum.MAX);
			this.firePropertyChangeEvent(pcEvent);
		} if (eingabe <= getMinTemp()) {
			this.maxMinEnum = MaxMinEnum.MIN;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "maxMinEnum", MaxMinEnum.NEU, MaxMinEnum.MIN);
			this.firePropertyChangeEvent(pcEvent);
		}
	}
	
	/**
	 * Gibt Statistik aus.
	 */
	public void datenAusgeben() {
		System.out.println("Program beendet");
		System.out.println();
		System.out.println("Anzahl Temperatur Objekte: " + getCount());
		System.out.println("Durchschnitts Temperatur: " + getAvgTemp());
		System.out.println("Max Temperatur: " + getMaxTemp());
		System.out.println("Min Temperatur: " + getMinTemp());
	}
}
