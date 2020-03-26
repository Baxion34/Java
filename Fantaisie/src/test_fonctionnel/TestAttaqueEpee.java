package test_fonctionnel;

import affrontement.Bataille;
import armes.Epee;
import protagonistes.Dragon;
import protagonistes.Heros;
import protagonistes.Homme;

public class TestAttaqueEpee {
	public static void main(String[] args) {
		Heros arthur = new Heros("Arthur");
		Homme thomas = new Homme("Thomas");
		Homme jacques = new Homme("Jacques");
		Dragon dragonNoir = new Dragon("Dragon noir");

		Epee excalibur = new Epee("excalibur");

		Bataille bataille = new Bataille();

		arthur.rejointBataille(bataille);
		thomas.rejointBataille(bataille);
		jacques.rejointBataille(bataille);
		dragonNoir.rejointBataille(bataille);

		for (int i = 0; i < 10; i++) {
			System.out.print(jacques.prendre(excalibur));
			System.out.print(jacques.lacher());
		}

		System.out.print(arthur.prendreEpee(excalibur));
		System.out.print(thomas.prendre(excalibur));

		// RESULTAT ATTENDU
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Jacques : Je prends l’épée même si pour cela je dois perdre des forces.
		// Jacques a voulu prendre l’épée mais son état de fatigue ne lui permettait pas
		// cet ultime effort, il en est mort.
		// C’est ainsi que le courageux Jacques mourut.
		// Personne ne peut lacher cette arme car personne ne la possède !
		// Le héros Arthur : je prends excalibur
		// Thomas : Je prends l’épée même si pour cela je dois perdre des forces.
	}
}
