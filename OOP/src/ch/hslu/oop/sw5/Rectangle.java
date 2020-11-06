package ch.hslu.oop.sw5;

/**
 * @author nizam.
 * Stellt ein Rechteck dar und erbt von Superklasse Shape.
 */
public final class Rectangle extends Shape {
	private float width;
	private float height;
	
	 /**
	  * Erstellt ein Rechteck-Objekt.
	  * @param x setzt x Wert als int in Superklasse.
	  * @param y setzt y Wert als int in Superklasse.
	  * @param width setzt L�nge als int.
	  * @param height setzt Breite als int.
	  */
	public Rectangle(final int x, final int y, final float width, final float height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Weist neue Werte L�nge/Breite zu.
	 * @param newWidth L�nge.
	 * @param newHeight H�he.
	 */
	public void changeDimension(final float newWidth, final float newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	/**
	 * @return gibt L�nge zur�ck.
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * @return gibt H�he zur�ck.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Berechnet den Umfang des Rechtecks
	 */
	@Override
	public float getPerimeter() {
		return Math.round(100.0f * ((2 * this.width) + (2 * this.height))) / 100.0f;
	}

	/**
	 * Berechnet die Fl�che des Rechtecks.
	 */
	@Override
	public float getArea() {
		return Math.round(100.0f * (width * height)) / 100.0f;
	}

}