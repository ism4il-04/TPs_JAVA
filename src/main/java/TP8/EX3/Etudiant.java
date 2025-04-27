package TP8.EX3;

import java.util.List;
import java.util.Map;

public class Etudiant {
    private String NIP;
    private String nom;
    private String prenom;
    private Formation formation;
    private Map<String, List<Float>> resultats;

    public Etudiant(String NIP,String nom, String prenom) {
        this.NIP=NIP;
        this.nom=nom;
        this.prenom=prenom;
    }

    public void ajouterNote(String matiere,float note) {
        resultats.get(matiere).add(note);
    }
    public void moyenneParMatiere(String matiere) {
        float moyenne=0;
        for (float note : resultats.get(matiere)) {
            moyenne+=note;
        }
        moyenne = moyenne / resultats.get(matiere).size();
    };
    public void moyenneGenerale() {};
}
