package fr.algorithmie;

public class calculMoyenne {
//	• Quelle est la moyenne des éléments du tableau ?

	public static float moyenne(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		float moy = sum/array.length;
		return moy;

	}

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	System.out.println(moyenne(array));
	}

}
