package ch.hslu.oop.sw10;


/**
 * @author nizam.
 * Ist zust�ndig f�r ein/aus Methoden.
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
	 * @return gibt anzahl ein/aus Schaltungen zur�ck
	 */
	long getSwitchCount();
}