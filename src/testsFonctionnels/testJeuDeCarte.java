package testsFonctionnels;

import Carte.carte;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import Carte.Attaque;
import Carte.Probleme;
import Carte.Type;
import Carte.Bataille;
import Carte.Borne;
import Carte.DebutLimite;
import Carte.FinLimite;
import Carte.JeuDeCartes;
import Carte.Parade;
import Carte.Limite;
import Carte.Botte;

public class testJeuDeCarte {
	public static void main(String[] args) {
		JeuDeCartes oui = new JeuDeCartes();
		oui.affichageJeuDeCartes();
	}
}