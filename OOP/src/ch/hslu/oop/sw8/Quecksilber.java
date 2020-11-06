package ch.hslu.oop.sw8;

/**
 * @author nizam.
 * ist Subklasse von Superklasse Element.
 */
public class Quecksilber extends Element{
		
	/**
	 * Setzt Name, Schmelzpunkt und Siedepunkt des Elemetes Quecksilber.
	 */
	public Quecksilber() {
		super(-38.83f, 356.7f);
	}

	@Override
	public String getName() {
		return "Quecksilber";
	}

	@Override
	public String toString() {
		return "GIFTIG";
	}

}
