package Carte;

public class JeuDeCartes {
	
	private Configuration[] typesDeCartes= {
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10),
			new Configuration(new Borne(75), 10),
			new Configuration(new Borne(100), 12),
			new Configuration(new Borne(200), 4),
			new Configuration(new Botte(Type.FEU), 1),
			new Configuration(new Botte(Type.ACCIDENT), 1),
			new Configuration(new Botte(Type.ESSENCE), 1),
			new Configuration(new Botte(Type.CREVAISON), 1),
			new Configuration(new Attaque(Type.FEU),5),
			new Configuration(new Attaque(Type.ACCIDENT),3),
			new Configuration(new Attaque(Type.CREVAISON),3),
			new Configuration(new Attaque(Type.ESSENCE),3),
			new Configuration(new Parade(Type.FEU),14),
			new Configuration(new Parade(Type.ESSENCE),6),
			new Configuration(new Parade(Type.ACCIDENT),6),
			new Configuration(new Parade(Type.CREVAISON),6),
			new Configuration(new DebutLimite(),4),
			new Configuration(new FinLimite(),6),
	};
	
	
	public String affichageJeuDeCartes() {
		StringBuilder oui= new StringBuilder();
		for (int i=0;i<typesDeCartes.length;i++) {
			oui.append(typesDeCartes[i].nbExemplaires+ " " + typesDeCartes[i].getCarte().toString() + "\n");
		}
		return oui.toString();
	}
	
	private static class Configuration {
		
		private int nbExemplaires;
		private carte carte;
		
		private Configuration(carte carte, int nbExemplaire) {
			this.nbExemplaires=nbExemplaire;
			this.carte=carte;
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}
		
		public carte getCarte() {
			return carte;
		}
		
	}
}
