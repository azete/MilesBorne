package utils;

import java.util.List;

public class GestionCartes {
	public static <T> T extraire(List<T> liste) {
		if (liste.isEmpty()) {
			throw new IllegalArgumentException("La liste ne doit pas être vide.");
		}
		int index = (int) (Math.random() * liste.size());
		return liste.remove(index);
	}
}
