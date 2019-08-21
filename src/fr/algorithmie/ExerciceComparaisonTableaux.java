package fr.algorithmie;

public class ExerciceComparaisonTableaux {
//	• Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2 tableaux

	public static int comparaisonTableaux(int a1[], int a2[]) {
		int commonelement = 0;
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					commonelement++; 
				}
			}
			
		}
		return commonelement; 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;  
	int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ; 
	
	System.out.println(comparaisonTableaux(array1, array2));
	

	}

}
