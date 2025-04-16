package TP5.EX1;

public class Administratif extends Personnel {
    private float primesDeplacement;
    public Administratif(String nom, String prenom, float salaire, float primesDeplacement) {
        super(nom,prenom,salaire);
        this.primesDeplacement = primesDeplacement;
    }
    @Override
    public String toString() {
        return "Administratif{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + CalculSalaire() +
                '}';
    }

    @Override
    public float CalculSalaire() {
        return salaire + primesDeplacement;
    }
}
