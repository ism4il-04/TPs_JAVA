package TP5.EX1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Instancier une ListeObjet
        ListeObjet liste = new ListeObjet();

        // Ajouter des objets de différents types
        Doyen doyen = Doyen.getInstance("Jean", "Duval", 4000.0f, 500.0f);
        Etudiant etudiant1 = new Etudiant("Alice", "Dupont", 16.0f);
        Etudiant etudiant2 = new Etudiant("Bob", "Martin", 14.5f);
        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
        listeEtudiants.add(etudiant1);
        listeEtudiants.add(etudiant2);

        Enseignant enseignant = new Enseignant("Sophie", "Leclerc", 2500.0f, "Professeur", listeEtudiants, 8);
        Administratif administratif = new Administratif("Marie", "Durand", 1800.0f, 300.0f);

        // Ajouter les objets à la liste
        liste.ajouterObjet(doyen);
        liste.ajouterObjet(etudiant1);
        liste.ajouterObjet(etudiant2);
        liste.ajouterObjet(enseignant);
        liste.ajouterObjet(administratif);

        // Afficher la liste complète
        System.out.println("\n===== Contenu de la liste des objets =====");
        liste.afficherListe();

        // Vérifier la présence d'un objet
        System.out.println("\nLa liste contient l'étudiant Alice ? " + liste.contient(etudiant1));

        // Supprimer un objet de la liste
        liste.supprimerObjet(etudiant2);

        // Afficher la liste après suppression
        System.out.println("\n===== Contenu de la liste après suppression =====");
        liste.afficherListe();

        // afficher les enseignants
        liste.afficherEnseignants(liste);

        // Vider la liste
        liste.vider();

        // Afficher la liste après le vidage
        System.out.println("\n===== Contenu de la liste après vidage =====");
        liste.afficherListe();
    }
}