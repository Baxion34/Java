package test_fonctionnel;
import bataille.Bataille;
import personnage.*;

public class TestIntermediaire {
	public static void main (String argv[]) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Romain chorus = new Romain("Chorus", 6);
		Gaulois agecanonix = new Gaulois("Agecanonix", 8);
		Romain faitexcus = new Romain("Faitexcus", 6);
		
		Bataille battle = new Bataille();
		battle.ajouter(asterix);
		battle.ajouter(abraracourcix);
		battle.ajouter(agecanonix);
		
		battle.ajouter(faitexcus);
		battle.ajouter(chorus);
		battle.ajouter(minus);
		
		battle.afficherEquipes();
	}
}
