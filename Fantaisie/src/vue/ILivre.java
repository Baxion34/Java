package vue;

public interface ILivre {
	public default void ecrire(String texte) {
		System.out.print(texte);
	}
}
