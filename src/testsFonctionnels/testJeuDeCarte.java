package testsFonctionnels;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import cartes.Attaque;
import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.JeuDeCartes;
import cartes.Limite;
import cartes.Parade;
import cartes.Probleme;
import cartes.Type;

public class testJeuDeCarte {
	public static void main(String[] args) {
		JeuDeCartes jeuDeCartes = new JeuDeCartes();
		System.out.println(jeuDeCartes.affichageJeuDeCartes());
		Carte[] yes = jeuDeCartes.donnerCartes();
		for (int i = 0; i < yes.length; i++) {
			System.out.println(yes[i]);
		}
	}
}