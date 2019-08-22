package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Faire un programme avec le menu suivant :  
//			1. Ajouter un nombre  
//			2. Afficher les nombres existants.  
//			 
//			Description : 
//			Demander à l’utilisateur de choisir une option dans le menu.  
//	
//			Si l’utilisateur sélectionne l’option 1, le programme demande un nombre à l’utilisateur puis l’ajoute à un tableau.  
//			Si l’utilisateur sélectionne l’option 2, le programme affiche le contenu du tableau.  
//			Si le tableau est plein, écrire un algorithme pour agrandir le tableau.
		interactifStockageNombre();

	}

	public static void interactifStockageNombre() {
		Scanner scan = new Scanner(System.in);
		int choix, count = 0;
		int[] array = new int[2];
		int[] array2 = null;
		do {
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			System.out.println("Pour sortir du menu tapez 3");
			choix = scan.nextInt();

			switch (choix) {
			case 1:
				System.out.println("Entrez le nombre à ajouter");
				if (count >= array.length) {
					array2 = new int[array.length + 1];
					for (int i = 0; i < array.length; i++) {
						array2[i] = array[i];
					}
					array = array2;
					array2[count] = scan.nextInt();
					count++;

				} else {
					array[count] = scan.nextInt();
					count++;
				}

				break;
			case 2:
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
				break;
			}
		} while (choix != 3);
		scan.close();
	}

}
