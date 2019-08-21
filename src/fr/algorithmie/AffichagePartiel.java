package fr.algorithmie;

public class AffichagePartiel {

//	Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3

	public static void intsup3(int[] array) {
//		seulement l'affichage
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(array[i]);

			}
		}
	}

//	• Combiner une boucle et un test de manière à n’afficher que les entiers pairs
	public static void evennumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
//			ajout d'une condition pour afficher les entiers pairs positifs
			if (array[i] % 2 == 0 && array[i] > 0) {
				System.out.println(array[i]);
			}

		}
	}

//	• Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs et positifs
	public static void indexofevennumber(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] > 0) {
				System.out.println(i);

			}

		}
	}

//	• Combiner une boucle et un test de manière à n’afficher que les entiers impairs  
	public static void oddnumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
//		intsup3(array);
		evennumber(array);
		System.out.println();
		indexofevennumber(array);
		System.out.println();
		oddnumber(array);
	}

}
