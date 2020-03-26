package personnage;

public class Gaulois extends Combattant{
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String n, int f) {
		super(n, f);
		this.force = f;
	}
	
	@Override
	public void parler(String texte) {
		System.out.print("Le gaulois ");
		super.parler(texte);
	}
	
	@Override
	public void frapper(Combattant combattant) {
		System.out.println(getNom()+" envoie un grand coup dans la mâchoire de "+combattant.getNom()+".");
		combattant.recevoirCoup((getForce()/3)* effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est décuplée.");
	}
}
