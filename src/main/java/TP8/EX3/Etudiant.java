package TP8.EX3;

import java.util.List;
import java.util.Map;

public class Etudiant {
    private String NIP;
    private String nom;
    private String prenom;
    private Formation formation;
    private Map<String, List<Float>> resultats;

    public String getNom() {
        return nom;
    }

    public Etudiant(String NIP,String nom, String prenom) {
        this.NIP=NIP;
        this.nom=nom;
        this.prenom=prenom;
    }

    public void ajouterNote(String matiere,float note) {
        resultats.get(matiere).add(note);
    }
    public float moyenneParMatiere(String matiere) {
        float moyenne=0;
        for (float note : resultats.get(matiere)) {
            moyenne+=note;
        }
        return moyenne = moyenne / resultats.get(matiere).size();
    };
    public float moyenneGenerale() {
        float moyenne=0;
        float sommeCoefs=0;
        for (String matiere : resultats.keySet()) {
            float coefCourant=formation.getMatiereCoef(matiere);
            moyenne+=coefCourant*moyenneParMatiere(matiere);
            sommeCoefs+=coefCourant;
        }
        return moyenne / sommeCoefs;
    }
}
