package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle 
//		le nombre de rang N est égal à la somme des nombres de rangs N-1 et N-2  
//		• Créer une classe TestFibonacci 
//		• Demander à l’utilisateur de choisir un rang N 
//		• Ecrire un algorithme qui calcule et affiche le nombre de rang N  
		Scanner scan = new Scanner(System.in);
		System.out.println("Choisissez un rang pour la suite de Fibonnaci : ");
		int rang = scan.nextInt(), n0 = 0, n1 = 1, resultat = 0;
		for (int i = 0; i < rang; i++) {
			resultat = n0 + n1;
			n0 = n1;
			n1 = resultat;
		}
		System.out.println(n0);

		scan.close();

	}

}
