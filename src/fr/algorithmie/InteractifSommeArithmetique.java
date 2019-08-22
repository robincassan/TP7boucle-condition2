package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Créer une classe InteractifSommeArithmetique 
//		Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les entiers compris entre 1 et ce nombre.  
//		Exemple si l’utilisateur saisit 5, le programme affiche: 15 
		System.out.println(sommeArithmetique());

	}

	public static int sommeArithmetique() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choisissez un entier  : ");
		int nb = scan.nextInt();
		int sum = 0;
		for (int i = nb; i >= 1; i--) {
			sum += i;
		}
		scan.close();
		return sum;

	}

}
