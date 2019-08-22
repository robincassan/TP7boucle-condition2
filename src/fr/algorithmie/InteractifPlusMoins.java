package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ecrire un jeu qui :
//			- choisit un nombre aléatoire entre 1 et 100 
//			- puis demande à l’utilisateur de trouver ce nombre en lui indiquant s’il est au-dessus ou en dessous du nombre, 
//			- Lorsque l’utilisateur a trouvé le nombre, le programme affiche 
//		« Bravo, vous avez trouvé en N coups » où N représente le nombre d’essais effecté par l’utilisateur 
//			- le programme se termine. 
		interactifPlusMoins();

	}

	public static void interactifPlusMoins() {

		Scanner scan = new Scanner(System.in);
		int nbrcoup = 0, min = 1, max = 100, nbchoice = 0, randnum = min + (int) (Math.random() * ((max - min) + 1));
		System.out.println("Vous devez deviner quel est le nombre choisi par l'ordinateur entre 1 et 100 ");
		do {
			nbchoice = scan.nextInt();
			nbrcoup++;
			if (nbchoice == randnum && nbrcoup == 1) {
				System.out.println("Bravo vous avez trouvé la solution du premier coup!");
			} else if (nbchoice == randnum && nbrcoup != 1) {
				System.out.println("Bravo vous avez trouvé la solution en " + nbrcoup + " coups");
			} else if (nbchoice > randnum) {
				System.out.println("Le nombre choisi est trop grand essayer un nombre plus petit");
			} else {
				System.out.println("Le nombre choisi est trop petit choisissez un nombre plus grand");
			}

		} while (randnum != nbchoice);

		scan.close();
	}
}
