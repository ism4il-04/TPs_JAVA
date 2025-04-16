package TP5.EX1;

public class Etudiant extends  Personne{
    private float moyenneAnnuelle;
    public Etudiant(String nom, String prenom, float moyenneAnnuelle){
        super(nom,prenom);
        this.moyenneAnnuelle = moyenneAnnuelle;
    }
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenneAnnuelle=" + moyenneAnnuelle +
                '}';
    }
}
