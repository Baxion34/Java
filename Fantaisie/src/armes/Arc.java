package armes;

import protagonistes.Dragon;

public class Arc extends Arme {
	private int nombreFleche;
	
	public Arc(int nombreFleche) {
		super("arc", 30);
		this.nombreFleche=nombreFleche;
	}
	
	public String attaque(Dragon dragon) {
		if(nombreFleche > 0) {
			nombreFleche--;
			return super.attaque(dragon);
		} else {
			return proprietaire.getNom() + " attaque " + dragon.getNom() + " avec son " + nature + ".\n" + "Malheureusement il ne possédait plus de flèches.\n";
		}
	}
	
	public int getNombreFleches() {
		return nombreFleche;
	}
}
