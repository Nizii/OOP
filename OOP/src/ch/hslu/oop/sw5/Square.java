package ch.hslu.oop.sw5;

/**
 * @author nizam.
 * Stellt ein Viereck dar und erbt von Superklasse Shape. 
 */
public class Square extends Shape {
	private float side;

	/**
	 * @param x setzt x Wert als int in Superklasse.
	 * @param y setzt y Wert als int in Superklasse.
	 * @param side setzt eine Seite des Vierecks als float.
	 */
	public Square(int x, int y, final float side) {
		super(x, y);
		this.side = side;
	}
	
	/**
	 * @param newSide setzt neue Seite.
	 */
	public void changeDimension(final float newSide) {
		side = newSide;
	}

	/**
	 * @return gibt eine Seite zurück.
	 */
	public float getSide() {
		return side;
	}
	
	/**
	 * Berechnet den Umfang des Vierecks.
	 */
	@Override
	public float getPerimeter() {
		return Math.round(100.0f * (4f * side)) / 100.0f;
	}

	/**
	 * Berechnet die Fläche des Vierecks.
	 */
	@Override
	public float getArea() {
		return Math.round(100.0f * (side * side)) / 100.0f;
	}

}
