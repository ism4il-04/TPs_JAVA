package TP5.EX1;

public class Personne {
    protected String nom;
    protected String prenom;
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public Personne (String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

}
