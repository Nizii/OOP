package ch.hslu.oop.pr�fungsvorbereitung;

public class Sch�ler implements Comparable {
	private String vorname;
	private String nachname;
	
	public Sch�ler(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public boolean equals(Sch�ler s) {
		return (s == this);
	}
	
	@Override
	public int compareTo(Object o) {
		Sch�ler s = (Sch�ler) o;
		return (this.vorname.compareTo(s.nachname));
	}
}
	
	

