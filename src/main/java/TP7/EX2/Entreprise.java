package TP7.EX2;

public class Entreprise {
    protected int nombreEmployes;
    protected int capital;
    protected String nom;
    protected String mission;

    public Entreprise(int nombreEmployes, int capital, String nom, String mission) {
        this.nombreEmployes = nombreEmployes;
        this.capital = capital;
        this.nom = nom;
        this.mission = mission;
    }

    public String mission() throws SecretMissionException{
        return mission;
    }
    public int capital() {
        return capital;
    }

    public String getNom() {
        return nom;
    }


}
