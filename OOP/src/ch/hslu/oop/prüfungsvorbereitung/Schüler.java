package ch.hslu.oop.prüfungsvorbereitung;

public class Schüler implements Comparable {
	private String vorname;
	private String nachname;
	
	public Schüler(String vorname, String nachname) {
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
	
	public boolean equals(Schüler s) {
		return (s == this);
	}
	
	@Override
	public int compareTo(Object o) {
		Schüler s = (Schüler) o;
		return (this.vorname.compareTo(s.nachname));
	}
}
	
	

