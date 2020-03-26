package affrontement;

import protagonistes.Dragon;
import protagonistes.Homme;
import protagonistes.TypeEtreVivant;
import protagonistes.EtreVivant;

public class Bataille {
	private Camps campHomme = new Camps();
	private Camps campDragon = new Camps();

	public String ajouter(Homme homme) {
		String texte = "";
		campHomme.ajouterEtreVivant(homme);
		if (campHomme.nbCompagnon() > 1) {
			texte = homme.parler("Bonjour, je m'appelle " + homme.getNom() + " et je viens me joindre au combat.");
		} else {
			texte += (homme.getNom()
					+ " est le premier à se joindre à la dernière bataille entre les Hommes et les dragons.\n");
		}
		return texte;
	}

	public String ajouter(Dragon dragon) {
		String texte = "";
		campDragon.ajouterEtreVivant(dragon);
		if (campDragon.nbCompagnon() > 1) {
			texte = ("Un nouveau dragon " + dragon.getNom() + " s'approchait du champ de bataille.\n");
		} else {
			texte = "Le dragon " + dragon.getNom() + " fut le premier à arriver sur le champ de bataille.\n";
		}
		return texte;
	}

	public String eliminer(Dragon dragon) {
		String texte = "";
		campDragon.supprimerCompagnon(dragon);
		if (campDragon.nbCompagnon() == 0 && campHomme.nbCompagnon() > 0) {
			texte = "Les Hommes ont conquis la lande, leurs villages n'auront plus jamais à trembler devant les dragons.\n";
		}
		return texte;
	}

	public String eliminer(Homme humain) {
		String texte = "";
		campHomme.supprimerCompagnon(humain);
		if (campHomme.nbCompagnon() == 0 && campDragon.nbCompagnon() > 0) {
			texte = "Les dragons ont conquit la lande, les Hommes n'ont pas pu survivre dans ce monde hostile.\n";
		}
		return texte;
	}

	public EtreVivant selectionner(TypeEtreVivant type, int num) {
		EtreVivant retour = null;
		
		if(type.toString() == "homme") {
			retour=campHomme.selectionner(num);
		} else if(type.toString() == "dragon") {
			retour=campDragon.selectionner(num);
		}
		return retour;
	}
	
	public String afficherCamp(TypeEtreVivant type) {
		String retour = null;
		if(type.toString() == "homme") {
			retour=campHomme.afficherCamp();
		} else if(type.toString() == "dragon") {
			retour=campDragon.afficherCamp();
		}
		return retour;
	}
	
	public int donnerNombreHommes() {
		return campHomme.nbCompagnon();
	}
	
	public int donnerNombreDragons() {
		return campDragon.nbCompagnon();
	}
}
