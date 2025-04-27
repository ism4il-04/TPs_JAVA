package TP8.EX3;

import java.util.Map;

public class Formation {
    private int identifiant;
    private Map<String, Float> matiere;

    public Formation(int identifiant, Map<String, Float> matiere) {
        this.identifiant = identifiant;
        this.matiere = matiere;
    }

    public void ajouterMatiere(String nom, float coef) {
        matiere.put(nom, coef);
    }
    public void supprimerMatiere(String nom) {
        matiere.remove(nom);
    }
    public Float getMatiere(String nom) {
        return matiere.get(nom);
    }
}
