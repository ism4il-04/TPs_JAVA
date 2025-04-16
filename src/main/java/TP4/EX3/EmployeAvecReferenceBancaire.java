package TP4.EX3;

public class EmployeAvecReferenceBancaire extends Employe {
    private ReferenceBancaire referenceBancaire;

    public EmployeAvecReferenceBancaire(String nom, String prenom, int age, int anciennete, ReferenceBancaire referenceBancaire) {
        super(nom, prenom, age, anciennete);
        this.referenceBancaire = referenceBancaire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Reference Bancaire : " + referenceBancaire);
    }

    // Getter et Setter
    public ReferenceBancaire getReferenceBancaire() {
        return referenceBancaire;
    }

    public void setReferenceBancaire(ReferenceBancaire referenceBancaire) {
        this.referenceBancaire = referenceBancaire;
    }
}