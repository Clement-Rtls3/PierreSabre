package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;

	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public String parler() {
		return "(" + nom + ") - ";
	}

	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'apelle " + nom + " et j'aime boire du " + boisson);
	}

	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			System.out.println(parler() + "Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir "
					+ bien + " a " + prix + " sous");
		} else {
			System.out.println(parler() + "J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à "
					+ prix + " sous");
		}
		perdreArgent(prix);
	}

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
	}

}
