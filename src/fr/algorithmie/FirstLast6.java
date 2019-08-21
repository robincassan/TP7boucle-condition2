package fr.algorithmie;

public class FirstLast6 {
//	� Cr�er une classe FirstLast6 
//	� Dans cette classe, on d�clare un tableau d�entiers 
//	� On calcule une valeur bool�enne qui contr�le le tableau de la sorte : 
//		o elle vaut true si le tableau a au moins 1 �l�ment et si le premier �l�ment ou le dernier �l�ment vaut 6. 
//		o elle vaut false dans les autres cas � �crire l�algo de valorisation de cette variable avec le minimum de ligne 
	public static boolean firstLast6(int[] a) {
		boolean b;
		if (a.length >= 1 && (a[0] == 6 || a[a.length - 1] == 6)) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		System.out.println(firstLast6(array2));
	}

}
