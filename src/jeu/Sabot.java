package jeu;
import Carte.carte;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

public class Sabot implements Iterable<carte>{
	private int nbCartes;
	carte[] cartes;
	private int nombreCartesMax;
	private int indiceIterateur=0;
	private int nbOperations=0;
	
	public Sabot(int nombreCartesMax, int nbCartes) {
		this.nombreCartesMax=nombreCartesMax;
		cartes= new carte[nombreCartesMax];
		this.nbCartes=nbCartes;
	}
	
	public boolean estVide() {
		return (nbCartes==0);
	}
	
	public void ajouterCarte(carte carte) {
		try {
			cartes[nbCartes]=carte;
			nbCartes++;
		}catch (NullPointerException e) {
			System.out.println("depassement de la capacité");
		}
	}
	
	public carte piocher() {
		Iterateur it=new Iterateur();
		carte c=it.next();
		it.remove();
		return c;
	}
	
	public Iterator<carte> iterator() {
		return new Iterateur();
	}
	
	private class Iterateur implements Iterator<carte>{
		private boolean nextEffectue=false;
		private int nbOperationReference=nbOperations;
		
		public boolean hasNext() {
			return indiceIterateur<nbCartes;
		}
		
		public carte next() {
			verificationOperation();
			if (hasNext()) {
				carte carte=cartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue=true;
				System.out.println("je pioche" + carte.toString());
				return carte;
			}else {
				throw new NoSuchElementException();
			}
		}
		private void verificationOperation() {
			if (nbOperations!=nbOperationReference)
				throw new ConcurrentModificationException();
		}
		public void remove() {
			verificationOperation();
			cartes[nbCartes]=null;
			nbCartes-=1;
			nbOperationReference++;
			nbOperations++;
		}
	}
}
