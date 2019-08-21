package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

//	 Créer une classe SommeDeTableauxDiff 
//	 
//	• Créer un tableau qui contient la somme des 2 précédents tableaux 
	public static int[] sommeDeTableauxDiff(int[] a1, int[] a2) {
		if (a1.length >= a2.length) {
			int a3[] = new int[a1.length];
			for (int i = 0; i < a2.length; i++) {
				a3[i] = a1[i] + a2[i];
			}
			for (int i = a2.length; i < a1.length; i++) {
				a3[i] = a1[i];
			}
			return a3;
		} else {
			int a3[] = new int[a2.length];

			for (int i = 0; i < a1.length; i++) {
				a3[i] = a1[i] + a2[i];
			}
			for (int i = a1.length; i < a2.length; i++) {
				a3[i] = a2[i];
			}
			return a3;
		}

	}

	public static void main(String[] args) {
		int a1[] = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int a2[] = { -1, 12, 17, 14, 5, -9, 0, 18 };
		System.out.println(Arrays.toString(sommeDeTableauxDiff(a1, a2)));
		
	}

}
