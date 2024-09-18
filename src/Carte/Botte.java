package Carte;

public class Botte extends Probleme {

	public Botte(Type Type) {
		super(Type);
	}
	@Override
	public String toString() {
		Type type=getType();
		return type.getBotte();
	}
}
