package fr.algorithmie;

public class RechercheMax {
//	EXERCICE RECHERCHEMAX
//	• Créer une classe RechercheMax
//		
//• Rechercher le plus grand élément du tableau 
	public static int rechercheMax(int [] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];	
			}
		}
		return max; 
		
	}

	public static void main(String[] args) {
	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;  
	System.out.println(rechercheMax(array));

	}

}
