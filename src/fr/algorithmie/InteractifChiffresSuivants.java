package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		re un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres suivants. 
//		Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13, 14, 15. 
//		 
		Scanner scan = new Scanner(System.in);
		System.out.println("choisir un nombre entier : ");
		int nb = scan.nextInt();
		for (int i = nb + 1; i <= nb + 10; i++) {
			System.out.println(i);

		}

		scan.close();

	}

}
