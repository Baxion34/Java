package bataille;

import personnage.Combattant;
import personnage.Gaulois;
import personnage.Romain;

public class Bataille {
	private Gaulois[] equipeGauloise = new Gaulois[3];
	private Romain[] equipeRomaine = new Romain[3];
	private int nbGaulois = 0;
	private int nbRomain = 0;
	private int nbVictoireRomaine = 0;
	private int nbVictoireGauloise = 0;
	
	public void ajouter(Romain romain) {
		equipeRomaine[nbRomain] = romain;
		nbRomain++;
	}
	
	public void ajouter(Gaulois gaulois) {
		equipeGauloise[nbGaulois] = gaulois;
		nbGaulois++;
	}
	
	public void afficherEquipes() {
		System.out.print("Les gaulois toujours prêts pour la baston sont : ");
		afficherCombattants(nbGaulois, equipeGauloise);
		System.out.print("Les romains devant combattre sont : ");
		afficherCombattants(nbRomain, equipeRomaine);
	}
	
	private void afficherCombattants(int nbCombattant, Combattant[] equipe) {
		if(nbCombattant != 0) {
			for(int i=0; i < nbCombattant - 1; i++) {
				System.out.print(equipe[i].getNom()+", ");
			}
			System.out.println(equipe[nbCombattant-1].getNom()+".");
		}
	}
	
	public void combattre() {
		Combattant gaulois = equipeGauloise[nbGaulois - 1];
		Combattant romain = equipeRomaine[nbRomain - 1];
		boolean vainqueur = false;
		do {
			romain.frapper(gaulois);
			if (gaulois.isKO()) {
				vainqueur = true;
				nbGaulois--;
				nbVictoireRomaine++;
			} else {
				gaulois.frapper(romain);
				if (romain.isKO()) {
					vainqueur = true;
					nbRomain--;
					nbVictoireGauloise++;
				}
			}
		} while (!vainqueur);
	}

	public boolean resteCombattant() {
		return nbGaulois != 0 && nbRomain != 0;
	}

}
