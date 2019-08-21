package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
//	Créer une classe InteractifTantQue 
//	Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement compris entre 1 et 10 : 
//		- Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un nombre à l’utilisateur.  
//		- Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int nb = 0; 
		
		while (nb< 1 || nb > 10) {
			System.out.println("choisir un nombre compris entre 1 et 10");
			nb = scan.nextInt();
		}
		System.out.println("Vous avez choisi le nombre : " + nb);
		scan.close();

	}

}
