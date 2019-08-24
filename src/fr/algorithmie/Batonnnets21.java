package fr.algorithmie;

import java.util.Scanner;

public class Batonnnets21 {

	public static int affichageScore(int randnum, int nbtotbat, boolean joueur, String nom) {
		if (joueur) {
			System.out.println(nom + " vous avez choisi d'enlever " + randnum + " batonnet(s)");
		} else {
			System.out.println("Le PC choisi d'enlever " + randnum + " batonnet(s)");
		}
		nbtotbat -= randnum;
//		empêche que le nombre de batonnets affiché soit négatif
		if (nbtotbat <= 0) {
			nbtotbat = 0;
		}
		System.out.println("il reste " + nbtotbat + " batonnets");
		return nbtotbat;
	}

// Methode aléatoire
	public static void aleatoire() {
		Scanner scan = new Scanner(System.in);
		String nom;
		int max = 3, min = 1, choix = 0, randnum = min + (int) (Math.random() * ((max - min) + 1)), nbtotbat = 21;
		boolean joueur = false; // false si le joueur est le pc , vaut true si joueur est humain
		System.out.println("Veuillez entrer votre prénom : ");
		nom = scan.nextLine();
		System.out.println("Bonjour " + nom + " bienvenue au jeu des 21 batonnets");
		System.out.println("Vous allez jouer contre l’ordinateur. Celui qui prend le dernier baton a perdu. \r\n"
				+ "		Vous avez le droit de prendre entre 1 et 3 batons");
		System.out.println("l'ordinateur commence, il enleve " + randnum + " batonnets");
		nbtotbat -= randnum;
		System.out.println("il reste " + nbtotbat + " batonnets");
		do {
			boolean valchoisie;
			do {
				System.out.println(nom + " à vous de jouez, combien de batonnet(s) voulez-vous enlever? ");
				choix = scan.nextInt();
				joueur = true;
				valchoisie = true;
				if (choix > nbtotbat) {
					System.out.println("Vous ne pouvez pas enlever plus de batonnets qu'il n'en reste! \n "
							+ "Choix max " + nbtotbat);
					valchoisie = false;
				}
			} while ((choix < 1 || choix > 3) || !valchoisie);
			nbtotbat = affichageScore(choix, nbtotbat, joueur, nom);

			switch (nbtotbat) {
			case 3:
				randnum = min + (int) (Math.random() * ((2 - min) + 1));
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);

				break;
			case 2:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);

				break;

			case 1:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);

				break;
			case 0:
				break;

			default:
				randnum = min + (int) (Math.random() * ((max - min) + 1));
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);

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

////	methode ia qui fait systématiquement gagner le pc
	public static void ia() {
		// il faut faire passer le pc de 17 a 13 à 9 à 5 à 1 quand il a fini de jouer
		// pour qu'il soit sûr de gagner il faut que ce soit l'adversaire qui commence
		// systématiquement
		Scanner scan = new Scanner(System.in);
		int max = 3, min = 1, choix = 0, randnum = min + (int) (Math.random() * ((max - min) + 1)), nbtotbat = 21;
		boolean joueur = true; // false si le joueur est le pc , vaut true si joueur est humain
		System.out.println("Veuillez entrer votre prénom : ");
		String nom = scan.nextLine();
		System.out.println("Bonjour" + nom + " bienvenue au jeu des 21 batonnets");
		System.out.println("Vous allez jouer contre l’ordinateur. Celui qui prend le dernier baton a perdu. \r\n"
				+ "		Vous avez le droit de prendre entre 1 et 3 batons");
		do {
			boolean valchoisie;
			do {
				System.out.println(nom + " à vous de jouez, combien de batonnet(s) voulez-vous enlever? ");
				choix = scan.nextInt();
				joueur = true;
				valchoisie = true;
				if (choix > nbtotbat) {
					System.out.println("Vous ne pouvez pas enlever plus de batonnets qu'il n'en reste! \n "
							+ "Choix max " + nbtotbat);
					valchoisie = false;
				}
			} while ((choix < 1 || choix > 3) || !valchoisie);
			nbtotbat = affichageScore(choix, nbtotbat, joueur, nom);

			switch (nbtotbat) {
			case 20:
				randnum = 3;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 19:
				randnum = 2;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 18:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 17:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 16:
				randnum = 3;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 15:
				randnum = 2;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 14:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 13:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 12:
				randnum = 3;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 11:
				randnum = 2;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 10:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 9:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 8:
				randnum = 3;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 7:
				randnum = 2;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 6:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 5:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 4:
				randnum = 3;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 3:
				randnum = min + (int) (Math.random() * ((2 - min) + 1));
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 2:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 1:
				randnum = 1;
				joueur = false;
				nbtotbat = affichageScore(randnum, nbtotbat, joueur, nom);
				break;
			case 0:
				break;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Le jeu est simple mais la réalisation est plus délicate. 
//		Vous allez jouer contre l’ordinateur. Celui qui prend le dernier baton a perdu. 
//		Vous avez le droit de prendre entre 1 et 3 batons

//		ia();
		aleatoire();

	}
}
