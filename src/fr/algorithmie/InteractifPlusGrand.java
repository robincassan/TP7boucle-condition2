package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Créer une classe InteractifPlusGrand 
//		Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de ces nombres.  
		interactifPlusGrand();

	}

	public static void interactifPlusGrand() {

		Scanner scan = new Scanner(System.in);
		int max = 0;
		System.out.println("saisissez dix nombres entiers à la suite : ");
		for (int i = 0; i < 10; i++) {
			int nb = scan.nextInt();
			if (max < nb) {
				max = nb;
			}
		}
		System.out.println(max);
		scan.close();
	}

}
