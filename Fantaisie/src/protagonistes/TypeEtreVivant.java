package protagonistes;

public enum TypeEtreVivant {
	HOMME("homme"),
	HEROS("heros"),
	DRAGON("dragon");
	
	
	private String nom;
	TypeEtreVivant(String nom) {
		this.nom = nom;
	}
	
	public String toString(){
		return nom;
	}
}
