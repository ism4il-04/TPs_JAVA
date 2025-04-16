package TP4.EX3;

public class Manutentionnaire extends Employe implements ManutentionnaireARisque{
    private int nbHeures;
    private final double BASE_SALAIRE_HORAIRE;
    public Manutentionnaire(String nom, String prenom, int age, int anciennete, int nbHeures, double BASE_SALAIRE_HORAIRE) {
        super(nom, prenom, age, anciennete);
        this.nbHeures = nbHeures;
        this.BASE_SALAIRE_HORAIRE = BASE_SALAIRE_HORAIRE;
    }

    public double getBASE_SALAIRE_HORAIRE() {
        return BASE_SALAIRE_HORAIRE;
    }

    public double calculerBaseSalaire(){return BASE_SALAIRE_HORAIRE*nbHeures;};
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Type d'employe : Manutentionnaire ");
        System.out.println("nombre d'heures = "+nbHeures);
    }

    @Override
    public double getPrimeRisque() {
        return PRIME_RISQUE;
    }
}
