package personnages;

import personnages.Humain;
import personnages.Yakuza;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentADonner = (int) ((0.10) * argent);
		parler(beneficiaire.getNom() + " prend ces " + argentADonner + " sous");
		beneficiaire.recevoirArgent(argentADonner);
	}

	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		int force = 2 * honneur;
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
			argent += adversaire.getArgent();
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			argent = 0;
			honneur--;
		}
	}

}
