package ch.hslu.oop.pr�fungsvorbereitung;

import java.util.ArrayList;
import java.util.List;

public class Klasse {
	private int nr;
	private List<Sch�ler> list;
	
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
	
	public void klasseF�llen(String vorname, String nachname) {
		list.add(new Sch�ler(vorname, nachname));
	}

	public List<Sch�ler> getList() {
		return list;
	}
	
	public int getNr() {
		return nr;
	}
	
}
