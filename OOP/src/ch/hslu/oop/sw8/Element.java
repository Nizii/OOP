package ch.hslu.oop.sw8;

import java.util.Objects;

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
	 * @return Gibt Bezeichnung des Elements zurück.
	 */
	public abstract String getName();
	
	/**
	 * 
	 */	
	public abstract String toString();
	
	/**
	 * Gibt Hashwerte von zusammen von allen Datentypen aus.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.meltingpoint, this.boilingpoint, this.getName());
	}
	
	/**
	 * Vergleicht.
	 */
	public boolean equals(final Object object) {
		if (this == object){
			return true;
		}
		if (!(object instanceof Element)) {
			return false;
		}
		final Element other = (Element) object;
		return (other.meltingpoint == this.meltingpoint && other.boilingpoint == this.boilingpoint && other.getName() == this.getName());
	}
}
