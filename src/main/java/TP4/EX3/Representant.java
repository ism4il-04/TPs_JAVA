package TP4.EX3;

public class Representant extends Commercial{
    private int nbHeures;
    private double BASE_SALAIRE_HORAIRE;
    //duplication
    public Representant(String nom, String prenom , int age , int anciennete, int nbHeures, double BASE, double PART,double BASE_SALAIRE_HORAIRE) {
        super(nom,prenom, age, anciennete,nbHeures, BASE, PART);
        this.nbHeures = nbHeures;
        this.BASE_SALAIRE_HORAIRE = BASE_SALAIRE_HORAIRE;
    }
    @Override public double calculerBaseSalaire(){
        return BASE_SALAIRE_HORAIRE;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Type de commercial : representant");
        System.out.println("Nombre des heures travaillees : " + nbHeures);
    }
}
