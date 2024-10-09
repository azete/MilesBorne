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
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof Probleme && super.equals(obj)) {
        	Probleme probleme= (Probleme) obj;
        	return getType() == probleme.getType();
        }
        return false;
    }
}
