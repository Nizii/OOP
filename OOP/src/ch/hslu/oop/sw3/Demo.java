package ch.hslu.oop.sw3;

public class Demo {
	
	public Demo() {
		
	}
	
	// Wählt zwischen 2 Parameter den höchsten Wert und gibt diesen zurück
	public int intMax(final int a, final int b) {
		int z = 0;
		if (a < b) {
			z = b;
		} else if (a > b){
			z = b;
		} else {
			System.out.println("Werte sind gleich gross");
			z = b;
			return z;
		}
		return z;
	}
	
	// Wählt zwischen 3 Parameter den höchsten Wert und gibt diesen zuzrück
	public int intMax(final int a, final int b, final int c) {
		int z = 0;
		if ((a > b) && (a > c)) {
			z = a;
		} else if ((b > a) && (b > c)) {
			z = b;
		} else if ((c > b) && (c > a)) {
			z = c;
		} else {
			System.out.println("Werte sind alle gleich gross");
		}
		return z;
	}

	// For Schleife
	public void starteForSchleife() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	// While Schleife
	public void starteWhileSchleife() {
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}
	
	// Do While Schleife
	public void starteDoWhileSchleife() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}
	
	// Übung 2.3c,d
	public void starteFloatInteration() {
		float i = 0.9f;
		int zähler = 0;
		while (i <= 1 && zähler <= 10000) {
			//System.out.println(i);
			System.out.println(zähler);
			zähler++;
			i=+0.000025f;
		}
	}
	
	// Übung 2.3e
	public void starteFloatIteration() {
		float f = 0.9f;
		for(int i = 0; i <= 4000; i++) {
			f=+0.000025f;
			System.out.println(f);
		}
	}
	
	// Übung 2.3f
	
	public void printBox(final int height, final int with) {
		for(int x = 0; x <= height; x++) {
			for(int i = 0; i <= with; i++) {
				if(x == 0||x == height) {
					if(i < with) {
						System.out.print("#");
					} else {
						System.out.println("#");
					}
				} else {
					if (x > 0 || x < height) {
						if(i < 1) {
							System.out.print("#");
						} else if (i > 1 && i != with) {
							System.out.print(" ");
						} else if (i == with) {
							System.out.println(" #");
						}
					}
				}
			}
		}
	}
	
	// Schweizerkreuz
	public void printSchweizerkreuz(final int height, final int with) {
		for(int x = 0; x <= height; x++) {
			if (x <= (height/3) || x > ((height/3)*2)) {
				for(int i = 0; i <= with; i++) {
					if (i <= with/3) {
						System.out.print(" ");
					} else if (i >= (with/3) && i <= (with/3)*2){
						System.out.print("#");
					} else if (i == with){
						System.out.println(" ");
					} else {
						System.out.print(" ");
					}		
				}
			} else {
				for (int y = 0; y <= with; y++) {
					if (y < with) {
						System.out.print("#");
					} else {
						System.out.println("#");
					}
				}
			}
		}
	}	
}
