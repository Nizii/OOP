 package ch.hslu.oop.sw3;
/**
 * @author nizam.
 * Enth�lt x und y Wert von einem Punkt.
 */
public class Point {
	private int x;
	private int y;
	
	/**
	 * @param x Wert Zuweisung im Koordinatensystem.
	 * @param y Wert Zuweisung im Koordinatensystem.
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point point) {
		x = point.getX();
		y = point.getY();
	}
	
	/**
	 * �ndert Position des Punktes.
	 * @param x Koordinate.
	 * @param y Koordinate.
	 */
	public void moveRelative(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * �ndert Position des Punktes.
	 * @param p erh�lt ein Point Objekt.
	 */
	public void moveRelative(Point point) {
		this.x = point.getX();
		this.y = point.getY();
	}

	/**
	 * @return x Gibt x-Koordinate zur�ck.
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x Setzt x-Koordinate.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return y Gibt y-Koordinate zur�ck.
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y setzt y-Koordinate.
	 */
	public void setY(int y) {
		this.y = y;
	}
	

}
