package test_fonctionnel;

import bataille.Bataille;
import personnage.Druide;
import personnage.Equipement;
import personnage.Gaulois;
import personnage.Romain;

public class TestArmoricae {
	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 100);
		Romain minus = new Romain("Minus", 6);
		Romain chorus = new Romain("Chorus", 8);
		Romain faitexcus = new Romain("Faitexcus", 7);
		Bataille bataille = new Bataille();
		bataille.ajouter(obelix);
		bataille.ajouter(asterix);
		bataille.ajouter(minus);
		bataille.ajouter(chorus);
		bataille.ajouter(faitexcus);
		druide.preparerPotion();
		druide.booster(asterix);
		minus.sEquiper(Equipement.BOUCLIER);
		chorus.sEquiper(Equipement.CASQUE);
		faitexcus.sEquiper(Equipement.BOUCLIER);
		faitexcus.sEquiper(Equipement.CASQUE);
		bataille.afficherEquipes();
		do {
			bataille.combattre();
		} while (bataille.resteCombattant());
	}
}