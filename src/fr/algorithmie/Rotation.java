package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
//	EXERCICE ROTATION (DIFFICILE)
//	• Créer une classe Rotation
//	• Dans cette classe, on déclare un tableau d’entiers 
//	Effectuez une rotation à droite des éléments.
//	• Exemple : si vous avez {0,1,2,3} vous obtenez {3,0,1,2}

	public static int[] rotation(int[] a) {
		int[] r = new int[a.length];
		for (int i = 1; i < a.length; i++) {
			r[i] = a[i - 1];
		}
		r[0] = a[a.length - 1];
		return r;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println(Arrays.toString(rotation(a)));

	}

}
