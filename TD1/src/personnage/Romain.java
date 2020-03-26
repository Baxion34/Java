package personnage;

public class Romain extends Combattant{
	private int force;
	private Equipement equipements[] = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		super(nom, force);
		this.force = force;
	}
	
	@Override
	public void parler(String texte) {
		System.out.print("Le romain ");
		super.parler(texte);
	}
	
	@Override
	public void recevoirCoup(int forceCoup) {
		for(int i = 0; i < nbEquipement; i++) {
			if (this.equipements[i].equals(Equipement.BOUCLIER)) {
				forceCoup -= 8;
			} else {
				forceCoup -= 5;
			}
		}
		
		if (forceCoup < 0) {
			forceCoup = 0;
		}
		
		super.recevoirCoup(forceCoup);
	}
	
	@Override
	public void frapper(Combattant combattant) {
		System.out.println("Le soldat "+getNom()+" frappe "+combattant.getNom()+" de toutes ses forces.");
		combattant.recevoirCoup(getForce());
	}
	
	public void sEquiper(Equipement equip) {
		switch(this.nbEquipement) {
			case 2 :
				System.out.println("Le soldat "+getNom()+" est déjà bien protégé !");
				break;
			case 1 :
				if (equip == equipements[nbEquipement-1]) {
					System.out.println("Le soldat "+getNom()+" possède déjà "+equip.toString()+" !");
					break;
				} else {
					ajouterEquipement(equip);
					break;
				}
			default :
				ajouterEquipement(equip);
				break;
		}
	}

	private void ajouterEquipement(Equipement equip) {
		equipements[nbEquipement] = equip;
		nbEquipement++;
		System.out.println("Le soldat "+getNom()+" s'équipe avec un "+equip.toString()+".");
	}
}
