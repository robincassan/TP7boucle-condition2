package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 10. 
//		Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de multiplication de ce nombre. 
//		Exemple : 
//			
//			Table de 3 : 
//				3 * 1 = 3 
//				3 * 2 = 6 
//				… 
//				3 * 10 = 30
		tableMult();

	}

	public static void tableMult() {
		Scanner scan = new Scanner(System.in);
		int nb = 0;
		while (nb < 1 || nb > 10) {
			System.out.println("veuillez entrez un nombre entre 1 et 10 ");
			nb = scan.nextInt();
		}
		System.out.println("table de " + nb + " :");
		for (int i = 0; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + nb * i);

		}
		scan.close();
	}

}
