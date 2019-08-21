package fr.algorithmie;

public class FirstLast {
//	EXERCICE FIRSTLAST • Créer une classe FirstLast 
//	• Dans cette classe, on déclare un tableau d’entiers 
//	• On calcule une valeur booléenne qui contrôle le tableau de la sorte : 
//		o elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur 
//		o elle vaut false dans les autres cas 
//		• écrire l’algo de valorisation de cette variable avec le minimum de ligne
	public static boolean firstLast(int[] a) {
		boolean b;
		if (a.length >= 1 && a[0] == a[a.length - 1]) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2 = { 2, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		System.out.println(firstLast(array2));
	}

}
