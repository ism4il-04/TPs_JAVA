package TP4.EX3;

public class Commercial extends Employe{
    protected double chiffreAffaire;
    protected final double BASE, PART;
    public Commercial(String nom, String prenom, int age, int anciennete,  double chiffreAffaire,  double BASE, double PART) {
        super(nom, prenom, age, anciennete);
        this.chiffreAffaire = chiffreAffaire;
        this.BASE = BASE;
        this.PART = PART;
    }
    public double calculerBaseSalaire(){return BASE + PART * chiffreAffaire;};

    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Type d'employe : Commercial ");
        System.out.println("chiffre Affaire = "+chiffreAffaire);
    }
}
