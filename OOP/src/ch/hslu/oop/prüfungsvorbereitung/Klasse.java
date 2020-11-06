package ch.hslu.oop.prüfungsvorbereitung;

import java.util.ArrayList;
import java.util.List;

public class Klasse {
	private int nr;
	private List<Schüler> list;
	
	public Klasse(int nr) throws IllegalArgumentException {
		try {
			if (nr <= 0) {
				throw new IllegalArgumentException();
			} else {
				this.nr = nr;
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			e.getCause();
		}
		list = new ArrayList<>();
	}
	
	public void klasseFüllen(String vorname, String nachname) {
		list.add(new Schüler(vorname, nachname));
	}

	public List<Schüler> getList() {
		return list;
	}
	
	public int getNr() {
		return nr;
	}
	
}
