package ch.hslu.oop.sw5;

/**
 * @author nizam.
 */
public abstract class Shape {
	private int x;
	private int y;
	
	protected Shape(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	public final void move(final int newX, final int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract float getPerimeter();
	
	public abstract float getArea();
	
}
