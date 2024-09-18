package Carte;

public class Borne extends carte{
	private int km;
	

	public Borne(int km) {
		this.km = km;
	}

	private int getKm() {
		return km;
	}
	
	public String toString() {
		return " une carte qui donne "+ km + " km.";
	}
}
