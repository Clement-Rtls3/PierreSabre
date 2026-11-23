package personnages;

import personnages.Humain;

public class Ronin extends Humain {
	int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentADonner = (int) ((0.10) * argent);
		parler(beneficiaire.getNom() + " prend ces " + argentADonner + " sous");
		beneficiaire.recevoirArgent(argentADonner);
	}
}
