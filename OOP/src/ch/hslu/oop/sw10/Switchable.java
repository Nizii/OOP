package ch.hslu.oop.sw10;


/**
 * @author nizam.
 * Ist zuständig für ein/aus Methoden.
 */
public interface Switchable {
	
	/**
	 * Schaltet ein.
	 */
	void switchOn();
	
	/**
	 * Schaltet aus.
	 */
	void switchOff();
	
	/** 
	 * @return gibt true wenn Objekt eingeschaltet.
	 */
	boolean isSwitchedOn();
	
	/**
	 * @return gibt false wenn Objekt ausgeschaltet.
	 */
	boolean isSwitchedOff();
	
	/** 
	 * @return gibt anzahl ein/aus Schaltungen zurück
	 */
	long getSwitchCount();
}