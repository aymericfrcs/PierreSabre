package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;



public class HistoireTP4 {
	
	public static void main(String[] args) {
		
		/* Humain prof = new Humain("Prof", "Kombucha", 54);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50); */
		
		Commercant marco = new Commercant("Marco", "Thé", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println(" ");
		
		Yakuza yakulenoir = new Yakuza("Yaku Le Noir", "Whisky", 30, "Clan");
		yakulenoir.direBonjour();
		yakulenoir.extorquer(marco);
		
		System.out.println("");
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		
		
	}
}
