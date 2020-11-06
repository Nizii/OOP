package ch.hslu.oop.sw8;

/**
 * @author nizam.
 * ist Subklasse von Superklasse Element.
 */
public class Stickstoff extends Element{
	
	/**
	 * Setzt Name, Schmelzpunkt und Siedepunkt des Elemetes Stickstoff.
	 */
	public Stickstoff() {
		super(-210f, -195.8f);
	}

	@Override
	public String getName() {
		return "Stickstoff";
	}

	@Override
	public String toString() {
		return "GIFTIG";
	}

}
