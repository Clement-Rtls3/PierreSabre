package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30);
		yakuLeNoir.extorquer(marco);

	}

}
