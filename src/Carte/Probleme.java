package Carte;

import Carte.carte;
import Carte.Type;

public abstract class Probleme extends carte {

	private Type type;

	public Probleme(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
}
