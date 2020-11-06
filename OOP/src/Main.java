import ch.hslu.oop.sw2.Blei;
import ch.hslu.oop.sw2.Temperatur;
import ch.hslu.oop.sw3.Demo;
import ch.hslu.oop.sw3.Point;
import ch.hslu.oop.sw4.Auto;
import ch.hslu.oop.sw4.Licht;
import ch.hslu.oop.sw4.Linie;
import ch.hslu.oop.sw4.Motor;
import ch.hslu.oop.sw4.Switchable;
import ch.hslu.oop.sw5.Rectangle;
import ch.hslu.oop.sw5.Shape;;

public class Main {

	public static void main(String[] args) {
		
		Temperatur t = new Temperatur(-12000.76667567f);
		//t.addCelsius(1000f);
		t.getPhysicalstate("Blei");
		t.getPhysicalstate("Stickstoff");
		t.getPhysicalstate("Quecksilber");
		

		
		/*
		Square s = new Square(2,2,5.07329287f);
		System.out.println("Square");
		System.out.println("Area " + s.getArea());
		System.out.println("Perimeter " + s.getPerimeter());
		System.out.println();
		*/
		/*
		Circle c = new Circle(2,2,5.07329287f);
		System.out.println("Circle");
		System.out.println("Area " + c.getArea());
		System.out.println("Perimeter " + c.getPerimeter());
		System.out.println();
		*/
		/*
		Rectangle r = new Rectangle(2,2,5.07329287f,6.04484848F);
		System.out.println("Rectangle");
		System.out.println("Area " + r.getArea());
		System.out.println("Perimeter " + r.getPerimeter());
		*/
		
		
	}
}
