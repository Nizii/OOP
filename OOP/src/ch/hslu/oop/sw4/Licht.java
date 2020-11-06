package ch.hslu.oop.sw4;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author nizam.
 *
 */
public class Licht implements Switchable {
	private boolean lichtAn;
	private boolean lichtAus;
	private int lumen;
	private int counts;
	private LichtStatus status;
	private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
	
	
	/**
	 * Setzt Licht auf aus.
	 */
	public Licht() {
		lichtAn = false;
		lichtAus = true;
		lumen = 0;
		counts = 0;
	}


	@Override
	public void switchOn() {
		if (isSwitchedOff()) {
			lichtAn = true;
			lichtAus = false;
			lumen = 1500;
			count();
		
			this.status = LichtStatus.ON;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", LichtStatus.OFF, LichtStatus.ON);
			this.firePropertyChangeEvent(pcEvent);
			
		} else {
			
			this.status = LichtStatus.FAILURE;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", LichtStatus.OFF, LichtStatus.FAILURE);
			this.firePropertyChangeEvent(pcEvent);
		}
	}


	@Override
	public void switchOff() {
		if(isSwitchedOn()) {
			lichtAn = false;
			lichtAus = true;
			lumen = 0;
			count();
		
			this.status = LichtStatus.OFF;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", LichtStatus.ON, LichtStatus.OFF);
			this.firePropertyChangeEvent(pcEvent);
			
		} else {
			
			this.status = LichtStatus.FAILURE;
			final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", LichtStatus.ON, LichtStatus.FAILURE);
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


	@Override
	public boolean isSwitchedOn() {
		System.out.println("Licht ist an = " + lichtAn);
		return lichtAn;
	}


	@Override
	public boolean isSwitchedOff() {
		System.out.println("Licht ist aus = " + lichtAus);
		return lichtAus;
	}
	
	
	/**
	 * @return gibt Helligkeit zurück.
	 */
	public int getLumen() {
		return lumen;
	}

	
	/**
	 * inkrementiert.
	 */
	private void count() {
		counts++;
	}

	
	@Override
	public long getSwitchCount() {
		return counts;
	}
	
}
