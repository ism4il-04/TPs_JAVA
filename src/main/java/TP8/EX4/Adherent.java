package TP8.EX4;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
    private String nom;
    private String prenom;
    private Statut statut;
    List<Empruntable> empruntables= new ArrayList<>(5);

    public Adherent(String nom, String prenom, Statut statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "Etudiant:{ Nom ='"+nom+"' Prenom ='"+prenom+"' statut ='"+statut+"'}";
    }

    public boolean emprunter(Empruntable e) {



    }
    public boolean rendre(Empruntable e) {



    }

    public void afficherEmprunts() {



    }

}
