package TP7.EX2;

public class Entreprise {
    int nombreEmployes;
    int capital;
    String nom;
    String mission;

    public String mission() throws SecretMissionException{
        return mission;
    }
    public int capital() {
        return capital;
    }
}
