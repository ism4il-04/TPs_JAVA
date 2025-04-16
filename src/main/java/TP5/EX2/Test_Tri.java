package TP5.EX2;

import static TP5.EX2.Tri.triBulles;

public class Test_Tri {
    public static void main(String[] args) {
        int[] valeurs = {4, 2, 3, 1, 5, 8};
        EntierTriable tableau = new EntierTriable(valeurs);

        System.out.println("Tableau avant le tri :");
        tableau.afficher();

        triBulles(tableau);

        System.out.println("Tableau après le tri :");
        tableau.afficher();

        String[] listeMots = {"Porte", "Feuille", "Ahmed", "Messi", "Kiwi"};
        Dictionnaire dictionnaire = new Dictionnaire(listeMots);
        System.out.println("Avant tri : " + dictionnaire);
        triBulles(dictionnaire);
        System.out.println("Après tri : " + dictionnaire);

        double[] valeursDouble = {18.5, 2.1, 3.4, 17.2, 0.5};
        TableauDouble tableauDouble = new TableauDouble(valeursDouble);
        System.out.println("Tableau de doubles avant le tri :");
        tableauDouble.afficher();
        triBulles(tableauDouble);
        System.out.println("Tableau de doubles après le tri :");
        tableauDouble.afficher();
    }
}
