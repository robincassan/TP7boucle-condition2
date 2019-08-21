package fr.algorithmie;

public class InversionContenu {
	public static void affichage(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static void inversion(int[] array) {

//      Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy mais dans l�ordre inverse.
//      � Afficher l�ensemble des �l�ments des 2 tableaux

		int arraycopy[] = new int[array.length];
		for (int i = arraycopy.length; i > 0; i--) {
			arraycopy[array.length - i ] = array[i - 1];
		}
//		affichage du tableau invers�
		System.out.println("\n affichage du tableau invers� \n");
		affichage(arraycopy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		affichage(array);
		inversion(array);		

	}

}
