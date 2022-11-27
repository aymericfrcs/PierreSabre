package personnages;

public class Ronin extends Humain {

	private String nom;
	private String boissonFav;
	private int qttArgent;
	
	private int honneur = 1;
	
	
	public Ronin(String nom, String boissonFav, int qttArgent) {
		super(nom, boissonFav, qttArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = qttArgent / 10;
		System.out.println(qttArgent);
		System.out.println(argentDonne);
		beneficiaire.recevoir(argentDonne);
		qttArgent -= argentDonne;
		
	}
	
}
