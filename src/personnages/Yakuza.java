package personnages;

public class Yakuza extends Humain {

	
	private String nom;
	private String boissonFav;
	private int qttArgent;
	
	private int réputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boissonFav, int qttArgent, String clan) {
		super(nom, boissonFav, qttArgent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() + " , si tu tiens à la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		qttArgent += argentVole;
		super.parler("J'ai piqué les " + argentVole + " sous de "
				+ victime.getNom() + ", ce qui me fait "
				+ qttArgent + " sous dans ma poche. Hi ! Hi !");
		
	}
	
	
}
