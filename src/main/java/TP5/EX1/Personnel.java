package TP5.EX1;

public class Personnel extends Personne{
    protected float salaire;
    public Personnel(String nom, String prenom, float salaire){
        super(nom,prenom);
        this.salaire = salaire;
    }
    public float CalculSalaire(){
        return salaire;
    }
    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
