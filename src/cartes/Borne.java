package cartes;

public class Borne extends Carte{
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
