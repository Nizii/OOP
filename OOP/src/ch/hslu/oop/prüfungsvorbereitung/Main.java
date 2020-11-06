package ch.hslu.oop.prüfungsvorbereitung;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import ch.hslu.oop.sw7.Person;

public class Main {
	
	public static void main(String[] args) {
		Schüler c1 = new Schüler("Nizam", "Özdemir");
		Schüler c2 = new Schüler("Salvo", "Terzo");
		Schüler c3 = new Schüler("Adrian", "Arsch");
		final BinaryOperator<Integer> sumLambda = (s1,s2)->s1+s2;
		final int summe = sumLambda.apply(23,3);
		//System.out.println(summe);
		
		Comparator<Schüler> s = (s1,s2)-> s1.getVorname().compareTo(s2.getVorname());
		//System.out.println(s.compare(c1, c2));
		
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		System.out.println(2/3);
		
		
		

		
		
		
		
		
		/*
		Map map = new HashMap<Integer, String>();
		map.put(1, "Nizam");
		map.put(2, "Salvo");
		map.put(3, "Adrian");
		map.put(4, "Josu");
		
		//System.out.println(map.isEmpty());
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Set s = new HashSet<String>();
		s.add("Nizam");
		s.add("Salvo");
		s.add("Adi");
		
		Klasse k1 = new Klasse(1);
		k1.klasseFüllen("Nizam", "Özdemir");
		k1.klasseFüllen("Adrian", "Lopez");
		
		
		Schüler s1 = new Schüler("Nizam","Özdemir");
		Schüler s2 = new Schüler("Nizam","Özdemir");
		
		System.out.println(s1.compareTo(s1));
		*/
	}



}
		
		
		
		
		
		
		/*
		Klasse k1 = new Klasse(1);
		k1.klasseFüllen("Nizam", "Özdemir");
		k1.klasseFüllen("Adrian", "Lopez");
		
		
		Klasse k2 = new Klasse(2);
		k2.klasseFüllen("Salvo", "Terzo");
		k2.klasseFüllen("Adrian", "Lopez");
		
		
		t.fillHashMap(k1);
		t.fillHashMap(k2);
		
		t.zeigeKlasse(1);
		*/
