package TP8.EX4;

import java.util.ArrayList;
import java.util.List;

public class Adherent {
    private String nom;
    private String prenom;
    private Statut statut;
    List<Empruntable> empruntables= new ArrayList<Empruntable>(5);

    public Adherent(String nom, String prenom, Statut statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.statut = statut;
    }


}
