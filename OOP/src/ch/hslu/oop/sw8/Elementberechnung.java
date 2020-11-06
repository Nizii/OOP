package ch.hslu.oop.sw8;

import java.util.ArrayList;

import ch.hslu.oop.sw2.Blei;
import ch.hslu.oop.sw2.Element;
import ch.hslu.oop.sw2.Quecksilber;
import ch.hslu.oop.sw2.Stickstoff;

public class Elementberechnung {
	private ArrayList<Element> elementList;
	
	public Elementberechnung() {
		elementList = new ArrayList<>();
		fillElementList();
	}
	
	/**
	 * Füllt ArrayList mit Elementobjekten.
	 */
	private void fillElementList() {
		elementList.add(new Blei());
		elementList.add(new Quecksilber());
		elementList.add(new Stickstoff());
	}
	
	/**
	 * Gibt den status des Elements aus zur aktuellen Temperatur.
	 * @param element ist das Element von dem der Status ausgegeben werden soll.
	 */
	/*
	public void getPhysicalstate(String element) { 
		for(int i = 0; i < elementList.size(); i++) {
			Element e = elementList.get(i);
			if(e.getName().equals(element)) {
				if(celsius > e.getMeltingpoint() && celsius < e.getBoilingpoint()) {
					System.out.println(e.getName() + " flüssig");
				} else if (celsius >= e.getBoilingpoint()){
					System.out.println(e.getName() + " gasförmig");
				} else {
					System.out.println(e.getName() + " fest");
				}
			}
		}
	}
	*/
}
