package cartes;

public abstract class Carte {


	public abstract String toString();
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Carte carte = (Carte) obj;
        return this.getClass() == carte.getClass();
//		if (obj instanceof Carte) {
//			Carte carte = (Carte) obj;
//			return this.getClass() == carte.getClass();
//		}
//		return false;
    }
}
