package bataille;

public class Foret implements Narrateur {
	@Override
	public void afficherDecor() {
		System.out.println("Dans une sombre forêt en Armoricae, une bagarre va éclater.");
	}
	
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine) {
		if(nbVictoireRomaine >  nbVictoireGauloise) {
			System.out.println("César sera fier en apprenant que les ROmains ont remporté la bataille.");
		} else {
			System.out.println("Les Gaulois vont pouvoir célébrer leur victoire autour d'un banquet.");
		}
	}
}
