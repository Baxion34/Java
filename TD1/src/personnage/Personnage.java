package personnage;

public abstract class Personnage {
	private String nom;
	
	public Personnage(String n) {
		this.nom = n;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(nom+" : \""+texte+"\"");
	}
}
