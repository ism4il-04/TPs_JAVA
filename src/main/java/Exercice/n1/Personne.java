package Exercice.n1;

public class Personne {
    private String nom;
    private char sexe;
    private Adresse[] adresses;
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public char getSexe() {
        return sexe;
    }
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
    public Adresse[] getAdresses() {
        return adresses;
    }
    public void setAdresses(Adresse[] adresses) {
        this.adresses = adresses;
    }
    public Personne(String nom, Adresse[] adresses, char sexe) {
        this.nom = nom;
        this.adresses = adresses;
        this.sexe = sexe;
    }
}
