package protagonistes;

import affrontement.Bataille;
import armes.*;

public class Homme extends EtreVivant {
	private Arme maPossession;
		
	public Homme(String nom) {
		super(nom, 100);
	}
		
	public String parler(String texte) {
		return nom+" : "+texte+"\n";
	}
		
	public String rejointBataille(Bataille bataille) {
		this.bataille = bataille;
		return this.bataille.ajouter(this);
	}
	
	public String mourir() {
		return "C'est ainsi que le courageux "+nom+" mourut.\n"+bataille.eliminer(this)+(maPossession != null ? lacher() : "");
	}
	
	public String lacher() {
		String retour = null;
		if(this.maPossession != null) {
			retour = this.nom+" a lâché son "+maPossession.getNature()+".\n";
			maPossession.lacher();
			maPossession = null;
		} else {
			retour = "Personne ne peut lâcher cette arme car personne ne la possède !\n";
		}
		return retour;
	}
	
	public String prendre(Arme arme) {
		String retour = "";
		
		if(this.maPossession != null) {
			lacher();
		}
		
		if(arme.estPris()) {
			retour += this.parler(arme.getProprietaire().getNom()+" peux tu me laisser ton "+arme.getNature()+" ?");
			retour += arme.getProprietaire().parler("Pas de soucis, cela me permettra de reprendre mon souffle.");
			retour += arme.getProprietaire().lacher();
		}
		
		if(arme instanceof Epee) {
			retour += prendreEpee((Epee) arme);
		} else {
			retour += parler("Je prends mon "+arme.getNature()+".");
		}
		
		if(vie > 0) {
			maPossession = arme;
			arme.setProprietaire(this);
		}
		return retour;
	}
	
	public String combattre(Dragon dragon) {
		if(maPossession != null) {
			return maPossession.attaque(dragon);
		} else {
			return nom+" s'attaque sans aucune arme à "+dragon.getNom()+".\n"+this.mourir();
		}
	}
	
	public String prendreEpee(Epee epee) {
		vie -= 10;
		String retour = this.parler("Je prends l’épée même si pour cela je dois perdre des forces.");
		
		if(vie > 0) {
			return retour;
		} else {
			vie = 0;
			return retour+this.nom+" a voulu prendre l'épée mais son état de fatigue ne lui permettait pas cet ultime effort, il en est mort.\n"+this.mourir();
		}
	}
}

