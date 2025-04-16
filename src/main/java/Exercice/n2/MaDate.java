package Exercice.n2;

public class MaDate {
    private int jour;
    private int mois;
    private int annee;

    public MaDate(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return (jour + "/" + mois + "/" + annee);
    }

    public void ajouterUnJour() {
        if (jour==31 && mois==12){
            jour=mois=1;
            annee++;
        }else if (jour==31 && (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 )) {//mois à 31 jours
            jour = 1;
            mois++;
        } else if (jour == 30 && (mois == 4 || mois == 6 || mois == 9 || mois == 11) ){//mois à 30 jours
            jour = 1;
            mois++;
        } else if (jour == 28 && mois == 2 && !((annee%4 == 0 && annee%100 != 0) || (annee%400 == 0))) {//année nos bisextille
            jour=1;
            mois++;
        }else if (jour == 29 && mois==2 ){//année bisextille
            jour = 1;
            mois++;
        }else {
            jour++;
        }
    }
    public void ajouterPlusieursJours(int n){
        for (int i = 0; i<n; i++){
            ajouterUnJour();
        }
    }
}
