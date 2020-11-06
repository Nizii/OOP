package ch.hslu.oop.sw5;

/**
 * 
 * @author nizam.
 * Stellt ein Kreis dar und erbt von der Superklasse Shape.
 *
 */
public class Circle extends Shape{
	private float diameter;
	
	public Circle(final int x, final int y, final float diameter) {
		super(x,y);
		this.diameter = diameter;
	}
	
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	
	public float getDiameter() {
		return diameter;
	}

	@Override
	public float getPerimeter() {
		return Math.round(100.0f * (2 * 3.14f * (diameter / 2))) / 100.0f;
	}

	@Override
	public float getArea() {
		return Math.round(100.0f * (3.14f * ((diameter/2) * (diameter/2)))) / 100.0f;
	}

}
