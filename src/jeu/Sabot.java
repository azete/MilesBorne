package jeu;

import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

import java.util.ConcurrentModificationException;

public class Sabot implements Iterable<Carte> {
	private int nbCartes;
	private Carte[] cartes;
	private int indiceIterateur = 0;
	private int nbOperations = 0;

	public Sabot(Carte[] cartes) {
		this.cartes = cartes;
		this.nbCartes = cartes.length;

	}

	public boolean estVide() {
		return (nbCartes == 0);
	}

	public void ajouterCarte(Carte carte) {
		try {
			cartes[nbCartes] = carte;
			nbCartes++;
			nbOperations++;
		} catch (NullPointerException e) {
			System.out.println(" depassement de la capacit�");
		}
	}

	public Carte piocher() {
		Iterateur it = new Iterateur();
		Carte carte = it.next();
		it.remove();
		return carte;
	}

	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	private class Iterateur implements Iterator<Carte> {
		private boolean nextEffectue = false;
		private int nbOperationReference = nbOperations;

		@Override
		public boolean hasNext() {
			return indiceIterateur < nbCartes;
		}
		@Override
		public Carte next() {
			verificationOperation();
			if (hasNext()) {
				Carte carte = cartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
				System.out.println("je pioche " + carte.toString());
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}

		private void verificationOperation() {
			if (nbOperations != nbOperationReference)
				throw new ConcurrentModificationException();
		}
		
		@Override
		public void remove() {
			verificationOperation();
			if (nbCartes<1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i=indiceIterateur-1;i<nbCartes-1;i++) {
				cartes[i]=cartes[i+1];
			}
			nextEffectue=false;
			indiceIterateur--;
			nbCartes --;
			nbOperationReference++;
			nbOperations++;
		}
	}
}
