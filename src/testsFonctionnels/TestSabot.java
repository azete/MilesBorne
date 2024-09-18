package testsFonctionnels;
import jeu.*;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import Carte.*;

public class TestSabot {
	public static void main(String[] args) {
		Sabot sabot=new Sabot(110,0);
		sabot.ajouterCarte(new Borne(25));
		sabot.ajouterCarte(new Borne(25));
		sabot.ajouterCarte(new Borne(25));
		sabot.ajouterCarte(new Attaque(Type.FEU));
		sabot.ajouterCarte(new Parade(Type.FEU));
		sabot.ajouterCarte(new Botte(Type.FEU));
		// exo 2 a)
		for (int i=0;i<5;i++) {
			sabot.piocher();
		}
		
//		//exo 2 b)
//		Iterator<carte> oui=sabot.iterator();
//		for (int i=0;i<3;i++) {
//			oui.next();
//			oui.remove();
//		}
//		// exo 2 c)
//		Iterator<carte> non=sabot.iterator();
//		for (int i=0;i<3;i++) {
//			try {
//				non.next();
//				non.remove();
//				sabot.piocher();
//			}catch(ConcurrentModificationException e) {
//				throw new ConcurrentModificationException();
//			}
//		}
	}
}
