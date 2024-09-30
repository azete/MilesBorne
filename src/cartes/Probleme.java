package cartes;

import cartes.Carte;
import cartes.Type;

public abstract class Probleme extends Carte {

	private Type type;

	public Probleme(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
}
