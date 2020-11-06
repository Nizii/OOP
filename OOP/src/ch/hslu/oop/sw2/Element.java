package ch.hslu.oop.sw2;

/**
 * @author nizam.
 * Superklasse enth�lt zwei abstrakte Methoden die den Schmelz und Siedepunkt des Elements zur�ckgeben.
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
	 * @return Gibt Siedepunkt zur�ck.
	 */
	public float getBoilingpoint() {
		return boilingpoint;
	}
	
	/**
	 * @return Gibt Schmelzpunkt zur�ck.
	 */
	public float getMeltingpoint() {
		return meltingpoint;
	}
	
	/**
	 * @return Gibt Bezeichnung des Elements zur�ck
	 */
	public abstract String getName();
	
	/**
	 * 
	 */	
	public abstract String toString();
}
