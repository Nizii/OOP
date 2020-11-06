package ch.hslu.oop.sw2;

/**
 * @author nizam.
 * ist Subklasse von Superklasse Element.
 */
public class Blei extends Element{
	
	/**
	 * Setzt Name, Schmelzpunkt und Siedepunkt des Elemetes Blei.
	 */
	public Blei() {
		super(327.43f, 1744f);
	}

	@Override
	public String getName() {
		return "Blei";
	}

	@Override
	public String toString() {
		return "GIFTIG";
	}

}
