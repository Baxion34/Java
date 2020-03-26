package personnage;

public abstract class Combattant extends Personnage {
	private int force;
	
	public int getForce() {
		return this.force;
	}
	
	public Combattant(String nom, int force) {
		super(nom);
		this.force=force;
	}
	
	public void recevoirCoup(int forceCoup) {
		this.force -= forceCoup;
		if(this.force < 0) {
			this.force = 0;
		}
		
		if(this.force > 0) {
			parler("Aïe !");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public abstract void frapper(Combattant combattant);
	
	public boolean isKO() {
		return force <= 0;
	}
}
