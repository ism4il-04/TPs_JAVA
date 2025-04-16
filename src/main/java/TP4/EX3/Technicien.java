package TP4.EX3;

public class Technicien extends Employe implements TechnicienARisque{
    private int nbUnitesProduites;
    private final double BASE, PART, GAIN_UNITE;
    public Technicien(String nom, String prenom, int age, int anciennete, int nbUnitesProduites, double BASE, double PART, double GAIN_UNITE) {
        super(nom, prenom, age, anciennete);
        this.BASE = BASE;
        this.PART = PART;
        this.GAIN_UNITE = GAIN_UNITE;
        this.nbUnitesProduites = nbUnitesProduites;
    }
    public double calculerBaseSalaire(){return BASE+ nbUnitesProduites;};
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Type d'employe : Technicien ");
        System.out.println("nombre unites produites = "+nbUnitesProduites);
    }
    @Override
    public double getPrime() {
        return prime;
    }
}
