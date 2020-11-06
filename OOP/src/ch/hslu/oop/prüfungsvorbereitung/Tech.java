package ch.hslu.oop.pr�fungsvorbereitung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.BinaryOperator;

public class Tech {
	HashMap<Integer, Klasse> map;
	
	public Tech() {
		map = new HashMap<>();
	}
	
	public void fillHashMap(Klasse k) {
		map.put(k.getNr(), k);
	}
	
	public void zeigeKlasse(int nr) throws IllegalArgumentException, NumberFormatException {
		if (nr <= 0) {
			throw new NumberFormatException("Zahl darf nicht kleiner 0 sein");
			} else {
				List<Sch�ler> list = new ArrayList<>();
				Klasse k = map.get(nr);
				Sch�ler s = new Sch�ler(null,null);
				list = k.getList();
				
				for(int i = 0; i < list.size(); i++) {
					s = list.get(i);
					System.out.println(s.getVorname());
					System.out.println(s.getNachname());
					System.out.println();
				}
			}
		}
	
	public Sch�ler sch�lerErstellen(String vorname,String nachname) {
		return new Sch�ler(vorname, nachname);
		}
	
	public int hashCode() {
		return Objects.hash(this);
		
	}
	
	}
