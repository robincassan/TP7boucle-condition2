package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ecrire un jeu qui :
//			- choisit un nombre al�atoire entre 1 et 100 
//			- puis demande � l�utilisateur de trouver ce nombre en lui indiquant s�il est au-dessus ou en dessous du nombre, 
//			- Lorsque l�utilisateur a trouv� le nombre, le programme affiche 
//		� Bravo, vous avez trouv� en N coups � o� N repr�sente le nombre d�essais effect� par l�utilisateur 
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
				System.out.println("Bravo vous avez trouv� la solution du premier coup!");
			} else if (nbchoice == randnum && nbrcoup != 1) {
				System.out.println("Bravo vous avez trouv� la solution en " + nbrcoup + " coups");
			} else if (nbchoice > randnum) {
				System.out.println("Le nombre choisi est trop grand essayer un nombre plus petit");
			} else {
				System.out.println("Le nombre choisi est trop petit choisissez un nombre plus grand");
			}

		} while (randnum != nbchoice);

		scan.close();
	}
}
