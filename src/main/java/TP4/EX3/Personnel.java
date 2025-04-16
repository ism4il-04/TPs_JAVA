package TP4.EX3;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private List<Employe> employes;

    // Constructeur
    public Personnel() {
        this.employes = new ArrayList<>();
    }

    // Ajouter un employé
    public void embaucher(Employe e) {
        if (!employes.contains(e)) { // Évite les doublons
            employes.add(e);
            System.out.println(e.nom + " " + e.prenom + " a été embauché.");
        } else {
            System.out.println(e.nom + " " + e.prenom + " est déjà embauché(e).");
        }
    }

    // Supprimer un employé
    public void licencier(Employe e) {
        if (employes.remove(e)) {
            System.out.println(e.nom + " " + e.prenom + " a été licencié(e).");
        } else {
            System.out.println(e.nom + " " + e.prenom + " n'est pas dans la liste.");
        }
    }

    // Supprimer tous les employés
    public void licencierTous() {
        employes.clear();
        System.out.println("Tous les employés ont été licenciés.");
    }

    // Afficher les salaires
    public void afficherSalaires() {
        System.out.println("------ Liste des salaires ------");
        for (Employe e : employes) {
            System.out.println(e.nom + " " + e.prenom + ": " + e.calculerSalaire());
        }
    }

    // Calculer le salaire moyen
    public double salaireMoyen() {
        if (employes.isEmpty()) {
            return 0; // Pas d'employés
        }
        double totalSalaires = 0;
        for (Employe e : employes) {
            totalSalaires += e.calculerSalaire();
        }
        return totalSalaires / employes.size();
    }

    // Vérifier si un employé est dans la liste
    public boolean estPresent(Employe e) {
        return employes.contains(e);
    }
}