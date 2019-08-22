package fr.algorithmie;

import java.util.Scanner;

public class Batonnnets21 {
//	TODO Créer une methode ia qui fait systématiquement gagner le pc
//	public static void ia(int a) {
//		switch (a) {
//		case :
//			
//			break type;
//
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + a);
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Le jeu est simple mais la réalisation est plus délicate. 
//		Vous allez jouer contre l’ordinateur. Celui qui prend le dernier baton a perdu. 
//		Vous avez le droit de prendre entre 1 et 3 batons

		Scanner scan = new Scanner(System.in);
		String nom;
		int max = 3, min = 1, choix = 0, randnum = min + (int) (Math.random() * ((max - min) + 1)), nbtotbat = 21;
		boolean joueur = false; // false si le joueur est le pc , vaut true si joueur est humain
		System.out.println("Veuillez entrez votre prénom : ");
		nom = scan.nextLine();
		System.out.println("Bonjour" + nom + " bienvenue au jeu des 21 batonnets");
		System.out.println("Vous allez jouer contre l’ordinateur. Celui qui prend le dernier baton a perdu. \r\n"
				+ "		Vous avez le droit de prendre entre 1 et 3 batons");
		System.out.println("l'ordinateur commence, il enleve " + randnum + " batonnets");
		nbtotbat -= randnum;
		System.out.println("il reste " + nbtotbat + " batonnets");
		do {
			do {
				System.out.println(nom + " à vous de jouez, combien de batonnet(s) voulez-vous enlever? ");
				choix = scan.nextInt();
				joueur = true;

			} while (choix < 1 || choix > 3);

			System.out.println("Vous avez choisi d'enlever " + choix + " batonnet(s)");
			nbtotbat -= choix;
//			empêche que le nombre de batonnets affiché soit négatif
			if (nbtotbat <= 0) {
				nbtotbat = 0;
			}

			System.out.println("il reste " + nbtotbat + " batonnets");
			switch (nbtotbat) {
			case 3:
				System.out.println("l'ordinateur enleve " + (randnum = min + (int) (Math.random() * ((2 - min) + 1)))
						+ " batonnets");
				joueur = false;
				nbtotbat -= randnum;
//				empêche que le nombre de batonnets affiché soit négatif
				if (nbtotbat <= 0) {
					nbtotbat = 0;
				}
				System.out.println("il reste " + nbtotbat + " batonnets");

				break;
			case 2:
				System.out.println("l'ordinateur enleve " + (randnum = 1) + " batonnets");
				joueur = false;
				nbtotbat -= randnum;
//				empêche que le nombre de batonnets affiché soit négatif
				if (nbtotbat <= 0) {
					nbtotbat = 0;
				}
				System.out.println("il reste " + nbtotbat + " batonnets");

				break;
				
			case 1:
				System.out.println("l'ordinateur enleve " + (randnum = 1) + " batonnets");
				joueur = false;
				nbtotbat -= randnum;
//				empêche que le nombre de batonnets affiché soit négatif
				if (nbtotbat <= 0) {
					nbtotbat = 0;
				}
				System.out.println("il reste " + nbtotbat + " batonnets");

				break;
			case 0:
				break;

			default:
				System.out.println("l'ordinateur enleve " + (randnum = min + (int) (Math.random() * ((max - min) + 1)))
						+ " batonnets");
				joueur = false;
				nbtotbat -= randnum;
//				empêche que le nombre de batonnets affiché soit négatif
				if (nbtotbat <= 0) {
					nbtotbat = 0;
				}
				System.out.println("il reste " + nbtotbat + " batonnets");

			}
			// affiche le résultat de la partie
			if (joueur == true && nbtotbat <= 0) {
				System.out.println("Dommage " + nom + " vous avez perdu :(");
			} else if (joueur != true && nbtotbat <= 0) {
				System.out.println("vous avez gagné bravo " + nom + "!!!");
			}

		} while (nbtotbat > 0);
		System.out.println("le jeu est fini il n'y a plus de batonnets");

		scan.close();

	}
}
