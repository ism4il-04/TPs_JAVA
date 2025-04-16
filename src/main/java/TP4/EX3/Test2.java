package TP4.EX3;

public class Test2 {
    public static void main(String[] args) {
        // Test de la classe Representant
        Representant representant = new Representant(
                "Dupont", "Jean", 45, 10, 160, 15.0, 0.05, 20.0);
        System.out.println("----- Représentant -----");
        representant.afficher();
        System.out.println("Salaire calculé : " + representant.calculerSalaire());

        // Test de la classe Vendeur
        Vendeur vendeur = new Vendeur(
                "Martin", "Julie", 28, 5, 30000, 500.0, 0.2);
        System.out.println("\n----- Vendeur -----");
        vendeur.afficher();
        System.out.println("Salaire calculé : " + vendeur.calculerSalaire());

        // Test de la classe Technicien
        Technicien technicien = new Technicien(
                "Bernard", "Paul", 35, 7, 120, 800.0, 0.1, 10.0);
        System.out.println("\n----- Technicien -----");
        technicien.afficher();
        System.out.println("Salaire calculé : " + technicien.calculerSalaire());

    }
}
