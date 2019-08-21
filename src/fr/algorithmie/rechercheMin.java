package fr.algorithmie;

public class rechercheMin {

//	EXERCICE RECHERCHEMIN 
//	• Créer une classe RechercheMin
//		
//• Rechercher le plus petit élément du tableau 
	public static int rechercheMin(int[] array) {
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		System.out.println(rechercheMin(array));

	}

}
