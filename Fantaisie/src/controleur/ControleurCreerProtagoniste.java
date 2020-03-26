package controleur;

import protagonistes.*;

public class ControleurCreerProtagoniste {
	private StockEtreVivant stockEtreVivant;

	public ControleurCreerProtagoniste(StockEtreVivant etreVivant) {
		this.stockEtreVivant = etreVivant;
	}
	
	public void creerEtreVivant(TypeEtreVivant type, String nom) {
		switch(type) {
			case HOMME:
				Homme homme = new Homme(nom);
				stockEtreVivant.ajouterHomme(homme);
				break;
			case HEROS:
				Heros heros = new Heros(nom);
				stockEtreVivant.ajouterHeros(heros);
				break;
			case DRAGON:
				Dragon dragon = new Dragon(nom);
				stockEtreVivant.ajouterDragon(dragon);
				break;
		}
	}
}
