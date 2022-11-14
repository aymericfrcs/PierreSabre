package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int qttArgent;
	
	
	public Humain(String nom, String boissonFav, int qttArgent) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.qttArgent = qttArgent;
	}



	public String getNom() {
		return nom;
	}
	
	public int getQttArgent() {
		return qttArgent;
	}
	

	
	public void parler(String texte) {
		System.out.println("(" + this.nom + ") : " + texte);
	}
	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " 
				+ this.nom + " et j'aime boire du "
				+ this.boissonFav);
	}
	
	public void boire() {
		parler("Mmmmh, un bon verre de "
				+ boissonFav + "! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		this.qttArgent += gain;
	}
	
	public void perdreArgent(int perte) {
		this.qttArgent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix>this.qttArgent) {
			parler("Je n'ai plus que " + this.qttArgent
					+ " sous en poche. Je ne peux même pas "
					+ "m'offrir un kimono à " + prix
					+ "sous.");
		}
		else {
			parler("J'ai " + qttArgent + " sous en poche. "
					+ "Je vais pouvoir m'offrir " + bien
					+ " à " + prix + "sous");
			perdreArgent(prix);
		}
	}
	
}
