package protagonistes;

import affrontement.Bataille;

public class EtreVivant {
	protected String nom;
	protected int vie;
	protected Bataille bataille;
	
	public EtreVivant(String nom, int vie) {
		this.nom = nom;
		this.vie = vie;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String rejointBataille(Bataille bataille) {
		this.bataille = bataille;
		return "";
	}
	
	public String subirAttaque(int forceAttaque) {
		this.vie -= forceAttaque;
		String etat = getNom()+" subit une violente attaque, ";
		
		if(this.vie < 0) {
			this.vie = 0;
		}
		
		if(this.vie > 0) {
			return etat+"mais il parvient à se relever.\n";
		} else {
			return etat+"trop violente pour survivre.\n"+this.mourir();
		}
	}
	
	public String mourir() {
		return "";
	}
	
}
