package TP8.EX3;

import java.util.*;

public class Groupe {
    private Map<List<Etudiant>,Formation> groupe;

    public List<Etudiant> triParMerite(){
        Comparator<Etudiant> cmp = new ComparatorMerite();
        for (List<Etudiant> etudiants : groupe.keySet()) {
            etudiants.sort(cmp);
        }
        return null;
    }
    public List<Etudiant> triAlpha(){
        Comparator<Etudiant> cmp = new ComparatorAlpha();
        for (List<Etudiant> etudiants : groupe.keySet()) {
            etudiants.sort(cmp);
        }
        return null;
    }
    public List<Etudiant> triParMatiere(String matiere){
        Comparator<Etudiant> cmp = new ComparatorMatiere(matiere);
        for (List<Etudiant> etudiants : groupe.keySet()) {
           etudiants.sort(cmp);
        }
        return null;
    }
}

class ComparatorMerite implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        if(o1.moyenneGenerale() < o2.moyenneGenerale()){
            return 1;
        } else if (o1.moyenneGenerale() > o2.moyenneGenerale()){
            return -1;
        }
        return 0;
    }
}

class ComparatorAlpha implements Comparator<Etudiant>{

    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        if(o1.getNom().compareTo(o2.getNom()) == 0){
            return 1;
        }
        return 0;
    }
}

class ComparatorMatiere implements Comparator<Etudiant>{

    private String matiere;

    public ComparatorMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public int compare(Etudiant o1, Etudiant o2) {

        if(o1.moyenneParMatiere(matiere) < o2.moyenneParMatiere(matiere)){
            return 1;
        } else if (o1.moyenneParMatiere(matiere) > o2.moyenneParMatiere(matiere)) {
            return -1;
        }
        return 0;
    }
}