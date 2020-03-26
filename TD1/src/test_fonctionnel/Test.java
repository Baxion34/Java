package test_fonctionnel;
import personnage.*;


// A modif
public class Test {
	public static void main (String argv[]) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		Gaulois obelix = new Gaulois("Obélix", 16);
		
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		//panoramix.booster(asterix);
		panoramix.booster(obelix);
		asterix.parler("Bonjour");
		
		minus.parler("UN GAU... UN GAUGAU...");
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Force Minus : "+minus.getForce());
			asterix.frapper(minus);
		}
	}
}