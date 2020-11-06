package ch.hslu.oop.sw2;

/**
 * @author nizam.
 * Superklasse enthält zwei abstrakte Methoden die den Schmelz und Siedepunkt des Elements zurückgeben.
 */
public abstract class Element {
	private float meltingpoint;
	private float boilingpoint;
	
	/**
	 * Default Konstruktor.
	 */
	protected Element(float meltingpoint, float boilingpoint) {
		this.boilingpoint = boilingpoint;
		this.meltingpoint = meltingpoint;
	}
	
	/**
	 * @return Gibt Siedepunkt zurück.
	 */
	public float getBoilingpoint() {
		return boilingpoint;
	}
	
	/**
	 * @return Gibt Schmelzpunkt zurück.
	 */
	public float getMeltingpoint() {
		return meltingpoint;
	}
	
	/**
	 * @return Gibt Bezeichnung des Elements zurück
	 */
	public abstract String getName();
	
	/**
	 * 
	 */	
	public abstract String toString();
}
