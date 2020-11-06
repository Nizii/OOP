package ch.hslu.oop.sw10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nizam.
 *
 */
public class Motor implements Switchable{
	private boolean motorAn;
	private boolean motorAus;
	private int rpm;
	private int counts;
	private MotorStatus status;
	private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

	
	/**
	 * Setzt Motor auf aus.
	 */
	public Motor() {
		motorAn = false;
		motorAus = true;
		rpm = 0;
		counts = 0;
	}

	/**
	 * Schaltet Motor an.
	 */
	@Override
	public void switchOn() {
		if (isSwitchedOff()) {
			motorAn = true;
			motorAus = false;
			rpm = 500;
			count();
			
			this.status = MotorStatus.ON;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorStatus.OFF, MotorStatus.ON);
			this.firePropertyChangeEvent(pcEvent);
			
		} else {
			
			this.status = MotorStatus.FAILURE;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorStatus.OFF, MotorStatus.FAILURE);
			this.firePropertyChangeEvent(pcEvent);
		}
	}
	
	/**
	 * Schaltet Motor aus.
	 */
	@Override
	public void switchOff() {
		if(isSwitchedOn()) {
			motorAus = true;
			motorAn = false;
			rpm = 0;
			count();
		
			this.status = MotorStatus.OFF;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorStatus.ON, MotorStatus.OFF);
			this.firePropertyChangeEvent(pcEvent);
			
		} else {
			
			this.status = MotorStatus.FAILURE;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorStatus.ON, MotorStatus.FAILURE);
			this.firePropertyChangeEvent(pcEvent);
		}
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
	 * Üerprüft ob Motor an ist.
	 */
	@Override
	public boolean isSwitchedOn() {
		//System.out.println("Motor ist an = " + motorAn);
		return motorAn;
	}

	/**
	 * Überprüft ob Motor aus ist.
	 */
	@Override
	public boolean isSwitchedOff() {
		//System.out.println("Motor ist aus = " + motorAus);
		return motorAus;
	}
	
	
	/**
	 * @return gibt Umdrehungen zurück.
	 */
	public int getRPM() {
		return rpm;
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

