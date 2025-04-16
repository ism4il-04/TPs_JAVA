package TP5.EX3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // Création de plusieurs élèves
        Eleve eleve1 = new Eleve("Ismail");
        Eleve eleve2 = new Eleve("Zineb");
        Eleve eleve3 = new Eleve("Karim");

        eleve1.ajouterNote(15);
        eleve1.ajouterNote(20);
        eleve1.ajouterNote(-5); //note revient 0

        eleve2.ajouterNote(12);
        eleve2.ajouterNote(18);
        eleve2.ajouterNote(21);// note revient 20

        eleve3.ajouterNote(10);
        eleve3.ajouterNote(14);
        eleve3.ajouterNote(16);

        System.out.println("Avant le tri :");//affichage des éleves
        System.out.println(eleve1);
        System.out.println(eleve2);
        System.out.println(eleve3);

        ArrayList<Eleve> listeEleves = new ArrayList<>();//ajout à liste
        listeEleves.add(eleve1);
        listeEleves.add(eleve2);
        listeEleves.add(eleve3);

        Collections.sort(listeEleves); // tri des éleves

        System.out.println("\nAprès le tri :");
        for (Eleve e : listeEleves) {
            System.out.println(e);
        }
    }
}
