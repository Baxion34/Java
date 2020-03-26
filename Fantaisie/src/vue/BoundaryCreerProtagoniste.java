package vue;

import controleur.ControleurCreerProtagoniste;
import protagonistes.TypeEtreVivant;

public class BoundaryCreerProtagoniste {
	private ControleurCreerProtagoniste controleur;
	
	public BoundaryCreerProtagoniste(ControleurCreerProtagoniste controleurCP) {
		this.controleur = controleurCP;
	}
	
	public void creerProtagoniste() {
		int numTypeProtagoniste = 0;
		TypeEtreVivant typeEtreVivant = null;
		String nom;
		
		while(numTypeProtagoniste < 1 || numTypeProtagoniste > 3) {
			System.out.println("Quel type de personnage souhaitez-vous créer ?");
			System.out.println("1 - un héros");
			System.out.println("2 - un homme");
			System.out.println("3 - un dragon");
			numTypeProtagoniste = Clavier.entrerClavierInt();
			
			switch(numTypeProtagoniste) {
				case 1:
					typeEtreVivant = TypeEtreVivant.HEROS;
					break;
				case 2:
					typeEtreVivant = TypeEtreVivant.HOMME;
					break;
				case 3:
					typeEtreVivant = TypeEtreVivant.DRAGON;
					break;
				default:
					System.out.println("Vous devez entrer un nombre entre 1 et 3.");
			}
		}
		
		System.out.println("Comment souhaitez-vous l'appeler ?");
		nom = Clavier.entrerClavierString();
		controleur.creerEtreVivant(typeEtreVivant, nom);
	}
}
