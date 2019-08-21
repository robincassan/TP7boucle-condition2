package fr.algorithmie;

public class FirstLast {
//	EXERCICE FIRSTLAST � Cr�er une classe FirstLast 
//	� Dans cette classe, on d�clare un tableau d�entiers 
//	� On calcule une valeur bool�enne qui contr�le le tableau de la sorte : 
//		o elle vaut true si le tableau est de longueur sup�rieure ou �gale � 1 et que le premier et le dernier �l�ment du tableau ont la m�me valeur 
//		o elle vaut false dans les autres cas 
//		� �crire l�algo de valorisation de cette variable avec le minimum de ligne
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
