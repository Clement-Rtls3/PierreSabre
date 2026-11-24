package personnages;

import personnages.Humain;
import personnages.Commercant;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentVictime = victime.seFaireExtorquer();
		argent += argentVictime;
		parler("J'ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + argent
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public void perdre() {
		int argentBefore = argent;
		argent = 0;
		reputation -= 1;
		parler("J'ai perdu mon duel et mes " + argentBefore + " sous, snif... J'ai déshonoré le clan de " + clan);
	}

	public void gagner(int gain) {
		argent += gain;
		parler("Ce ronin pensait  vraiment battre " + nom + " du clan de " + clan + " ?\nJe l'ai dépouillé de ses "
				+ gain + " sous");
	}

}
