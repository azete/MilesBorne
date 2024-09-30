package cartes;

public class JeuDeCartes {

	private Configuration[] typesDeCartes = { new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10), new Configuration(new Borne(75), 10),
			new Configuration(new Borne(100), 12), new Configuration(new Borne(200), 4),
			new Configuration(new Botte(Type.FEU), 1), new Configuration(new Botte(Type.ACCIDENT), 1),
			new Configuration(new Botte(Type.ESSENCE), 1), new Configuration(new Botte(Type.CREVAISON), 1),
			new Configuration(new Attaque(Type.FEU), 5), new Configuration(new Attaque(Type.ACCIDENT), 3),
			new Configuration(new Attaque(Type.CREVAISON), 3), new Configuration(new Attaque(Type.ESSENCE), 3),
			new Configuration(new Parade(Type.FEU), 14), new Configuration(new Parade(Type.ESSENCE), 6),
			new Configuration(new Parade(Type.ACCIDENT), 6), new Configuration(new Parade(Type.CREVAISON), 6),
			new Configuration(new DebutLimite(), 4), new Configuration(new FinLimite(), 6), };

	public String affichageJeuDeCartes() {
		StringBuilder oui = new StringBuilder();
		for (int i = 0; i < typesDeCartes.length; i++) {
			oui.append(typesDeCartes[i].nbExemplaires + " " + typesDeCartes[i].getCarte().toString() + "\n");
		}
		return oui.toString();
	}

	public Carte[] donnerCartes() {
		int compte = 0;
		for (int i = 0; i < typesDeCartes.length; i++) {
			compte += typesDeCartes[i].nbExemplaires;
		}
		Carte[] carte = new Carte[compte];
		
		for (int i = 0, j = 0; i < typesDeCartes.length; i++) {
			for (int k = 0; k < typesDeCartes[i].nbExemplaires; k++) {
				carte[j] = typesDeCartes[i].carte;
				j++;
			}
		}
		return carte;
	}

	private static class Configuration {

		private int nbExemplaires;
		private Carte carte;

		private Configuration(Carte carte, int nbExemplaire) {
			this.nbExemplaires = nbExemplaire;
			this.carte = carte;
		}

		public int getNbExemplaires() {
			return nbExemplaires;
		}

		public Carte getCarte() {
			return carte;
		}

	}

	public boolean checkCount() {
		int countLimite = 0;
		int countBotte = 0;
		int countAttaque = 0;
		int countParade = 0;
		int countBorne = 0;
		for (Carte carte : donnerCartes()) {
			if (carte instanceof Attaque) {
				countAttaque++;
			} else if (carte instanceof Parade) {
				countParade++;
			} else if (carte instanceof DebutLimite || carte instanceof FinLimite) {
				countLimite++;
			} else if (carte instanceof Botte) {
				countBotte++;
			}
			else if (carte instanceof Borne) {
				countBorne++;
			}
		}
		System.out.println("Il y a " + countBorne + " Cartes Bornes.");
		System.out.println("Il y a " + countLimite + " Cartes Limite.");
		System.out.println("Il y a " + countBotte + " Cartes Bottes.");
		System.out.println("Il y a " + countParade + " Cartes Parade.");
		System.out.println("Il y a " + countAttaque + " Cartes Attaque.");
		return countBorne==46 && countLimite == 10 && countBotte == 4 && countParade == 32 && countAttaque == 14;
	}
}
