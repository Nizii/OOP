package ch.hslu.oop.sw7;

public class Person {
	private long id;
	private String nachname;
	private String vorname;
	
	public Person(String vorname, String nachname, long id) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.id = id;
	}
	
	public long getID() {
		return id;
	}

	public void setID(long id) {
		this.id = id;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	}
