package TP4.EX3;

public class Test4 {
    public static void main(String[] args) {
        // Création d'une référence bancaire
        ReferenceBancaire refBancaire = new ReferenceBancaire(12345, "Doe", "John", "Banque Nationale");


        // Approche par héritage
        EmployeAvecReferenceBancaire employe = new EmployeAvecReferenceBancaire("Brown", "Alice", 28, 2, refBancaire);
        employe.afficher();
    }
}