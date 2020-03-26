package armes;

import protagonistes.Homme;
import protagonistes.Dragon;

public class Arme {
	protected Homme proprietaire;
	protected String nature;
	protected int degats;
	
	public Arme(String nature,int degats){
		this.nature=nature;
		this.degats=degats;
	}
	
	public Homme getProprietaire() {
		return proprietaire;
	}
	
	public void setProprietaire(Homme proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public String getNature() {
		return nature;
	}
	
	public boolean estPris() {
		if(proprietaire == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void lacher() {
		this.proprietaire = null;
	}
	
	public String attaque(Dragon dragon) {
		if(estPris()) {
			
			return proprietaire.getNom()+" attaque "+dragon.getNom()+" avec son "+nature+".\n" + dragon.subirAttaque(degats);
		}
		return "";
	}	
}
