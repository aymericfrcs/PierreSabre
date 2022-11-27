package personnages;

public class Commercant extends Humain {

	private String nom;
	private String boissonFav;
	private int qttArgent;

	public Commercant(String nom, String boissonFav, int qttArgent) {
		super(nom, boissonFav, qttArgent);
		boissonFav = "Thé";
	}

	
	public int seFaireExtorquer() {
		int argent = super.getQttArgent();
		super.parler("J'ai tout perdu! Le monde est trop injuste...");
		return argent;
	}
	
	public void recevoir(int argent) {
		qttArgent += argent;
		super.parler(argent + " sous! Je te remercie généreux donateur!");
	}
	
	
}
