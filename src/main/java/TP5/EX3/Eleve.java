package TP5.EX3;

import java.util.ArrayList;
import java.util.Collections;

public class Eleve implements Comparable<Eleve> {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;
    // Constructeur
    public Eleve(String nom) {
        this.nom = nom;
        this.listeNotes = new ArrayList<>();
        this.moyenne = 0.0;
        System.out.println("Eléve Crée :"+ nom);
    }
    public String getNom() {return nom;}
    public ArrayList<Integer> getListeNotes() {return listeNotes;}
    public double getMoyenne() {return moyenne;}
    public void ajouterNote(int note) {
        if (note < 0) {
            note = 0;
        } else if (note > 20) {
            note = 20;
        }
        listeNotes.add(note);
        actualiserMoyenne();
    }
    private void actualiserMoyenne() { // pour la moyenne des notes
        if (listeNotes.isEmpty()) {
            moyenne = 0.0;
        } else {
            int somme = 0;
            for (int note : listeNotes) {
                somme += note;
            }
            moyenne = (double) somme / listeNotes.size();
        }
    }
    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return nom + ": {" + String.format("%.2f", moyenne) + "}";// Redéfinition de la méthode toString
    }
    // Implémentation de l'interface Comparable
    @Override
    public int compareTo(Eleve autreEleve) {
        if (this.moyenne < autreEleve.moyenne) {
            return -1;
        } else if (this.moyenne > autreEleve.moyenne) {
            return 1;
        } else {
            return this.nom.compareTo(autreEleve.nom);
        }
    }
}
