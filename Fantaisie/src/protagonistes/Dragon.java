package protagonistes;

import affrontement.Bataille;

public class Dragon extends EtreVivant {
	private int nbMaxBouleFeu;
	
	public Dragon(String nom) {
		super(nom, 200);
		this.nbMaxBouleFeu = 10;
	}
	
	public String rejointBataille(Bataille bataille) {
		this.bataille = bataille;
		return this.bataille.ajouter(this);
	}
	
	public String mourir() {
		return "C'est ainsi que le dragon "+nom+" mourut.\n"+bataille.eliminer(this);
	}
	
	public String cracheBouleFeu(Homme homme) {
		if(nbMaxBouleFeu > 0) {
			nbMaxBouleFeu--;
			return nom+" crache une boule de feu sur "+homme.getNom()+".\n"+homme.subirAttaque(100);
		} else {
			return nom+" a voulu attaquer "+homme.getNom()+" mais il n'avait plus de feu en lui.\n"+homme.getNom()+" a eu beaucoup de chance !\n";
		}
	}
}