package TP4.EX3;

public class Employe {
    protected String nom;
    protected String prenom;
    protected int age;
    protected int anciennete;
    public void afficher(){
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Age : " + age);
        System.out.println("Anciennete : " + anciennete);
    }
    public double calculerSalaire(){
        return calculerBaseSalaire()+0.1*anciennete;
    }
    public double calculerBaseSalaire(){return 0;};
    public Employe(String nom, String prenom, int age, int anciennete){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.anciennete = anciennete;
    }
}
