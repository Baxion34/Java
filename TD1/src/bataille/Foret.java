package bataille;

public class Foret implements Narrateur {
	@Override
	public void afficherDecor() {
		System.out.println("Dans une sombre for�t en Armoricae, une bagarre va �clater.");
	}
	
	public void afficherVainqueur(int nbVictoireGauloise, int nbVictoireRomaine) {
		if(nbVictoireRomaine >  nbVictoireGauloise) {
			System.out.println("C�sar sera fier en apprenant que les ROmains ont remport� la bataille.");
		} else {
			System.out.println("Les Gaulois vont pouvoir c�l�brer leur victoire autour d'un banquet.");
		}
	}
}
