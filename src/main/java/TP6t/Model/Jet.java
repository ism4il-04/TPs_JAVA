package TP6t.Model;

public class Jet {
   private int Code;
    private String nomJet;
    private int pointsVie;
    private int pointsAttaque;
    private int pointsVitesse;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public int getPointsAttaque() {
        return pointsAttaque;
    }

    public void setPointsAttaque(int pointsAttaque) {
        this.pointsAttaque = pointsAttaque;
    }

    public int getPointsVie() {
        return pointsVie;
    }

    public void setPointsVie(int pointsVie) {
        this.pointsVie = pointsVie;
    }

    public String getNomJet() {
        return nomJet;
    }

    public void setNomJet(String nomJet) {
        this.nomJet = nomJet;
    }

    public int getPointsVitesse() {
        return pointsVitesse;
    }

    public void setPointsVitesse(int pointsVitesse) {
        this.pointsVitesse = pointsVitesse;
    }

    public Jet(int code, String nomJet, int pointsVie, int pointsAttaque, int pointsVitesse) {
        Code = code;
        this.nomJet = nomJet;
        this.pointsVie = pointsVie;
        this.pointsAttaque = pointsAttaque;
        this.pointsVitesse = pointsVitesse;
    }
}
