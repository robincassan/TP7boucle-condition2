package fr.algorithmie;

public class FabriquerMur {

	public static void main(String[] args) {

		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
		System.out.println("super pas d'erreur!!!");
	}

	// Ici attention à distinguer les variables globales (nbBigMax et nbSmallMax) et
	// locales(NbBig et NbSmall) car si on utilise les variables
//	globales dans les boucles elles ne sont jamais remise à zéro après un premier tour de boucle

	static boolean fabriquerMur(int nbSmallMax, int nbBigMax, int longueur) {
		boolean resultat = false;
		for (int nbSmall = 0; nbSmall <= nbSmallMax; nbSmall++) {
			for (int nbBig = 0; nbBig <= nbBigMax; nbBig++) {
//				System.out.println("nbSmall " + nbSmall);    POUR FACILITER TEST VERIFICATION
//				System.out.println("NbBig " + nbBig);
				if (nbSmall + 5 * nbBig == longueur) {
					resultat = true;
				}
			}
		}

		return resultat;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}