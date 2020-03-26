package personnage;
import java.util.*;

public class Druide extends Personnage{
	private final int FORCE_POTION_MIN;
	private final int FORCE_POTION_MAX;
	private int forcePotion = 0;
	
	public Druide(String n, final int FORCE_POTION_MIN, final int FORCE_POTION_MAX) {
		super(n);
		this.FORCE_POTION_MIN = FORCE_POTION_MIN;
		this.FORCE_POTION_MAX = FORCE_POTION_MAX;
	}
	
	@Override
	public void parler(String texte) {
		System.out.print("Le druide ");
		super.parler(texte);
	}
	
	public void preparerPotion() {
		Random aleatoire = new Random();
		// Nb aléatoire entre 5 et 10.
		forcePotion = aleatoire.nextInt(FORCE_POTION_MAX - FORCE_POTION_MIN) + FORCE_POTION_MIN;
		if (forcePotion > 7) {
			this.parler("J'ai préparé une super potion de force " + forcePotion + ".");
		} else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
			this.parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		} else {
			gaulois.boirePotion(this.forcePotion);
		}
	}
}
