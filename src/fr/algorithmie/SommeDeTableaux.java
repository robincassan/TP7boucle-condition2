package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableaux {
// Créer une classe SommeDeTableaux •
// • Créer un tableau qui contient la somme des 2 précédents tableaux 
	public static int[] sommeDeTableaux(int a1[], int a2[]) {
		int a3[] = new int[a1.length];
		for (int i = 0; i < a2.length; i++) {
			a3[i] = a1[i] + a2[i];
		}
		return a3;
	}

	public static void sommeDeTableaux() {

	}

	public static void main(String[] args) {
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };

		System.out.println(Arrays.toString(sommeDeTableaux(array1, array2)));
	}

}
