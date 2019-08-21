package fr.algorithmie;

public class AffichageInverse {

    public static void affichage(int[] array) {
//  Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("avec un foreach");
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("\n avec un for classique \n");
//  Afficher l’ensemble des éléments du tableau grâce à une boucle avec le for classique
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public static void affichageinverse(int[] array) {
//  Afficher l’ensemble des éléments dans l’ordre inverse du tableau

        System.out.println("\n Affchage inversé \n");
        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i - 1]);
        }
    }

    public static void copyarray(int[] array) {
//    Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] array1 = new int[array.length];
        System.out.println("\n affichage du tableau à copier \n");
        affichage(array);
        System.out.println("\n copie de tableau ");
        array1 = array;
        System.out.println("\n affichage tableau copié : \n");
        affichage(array1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

        affichage(array);
        affichageinverse(array);
//        AffichageInverse affichageInverse = new AffichageInverse();
//        affichageInverse.affichage(array);
        copyarray(array);
    }

}
