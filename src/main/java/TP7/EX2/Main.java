package TP7.EX2;

public class Main {

    public static void infoEntreprises(Entreprise[] entreprises) {
        for (Entreprise entreprise : entreprises) {
            System.out.println("\nEntreprise: " + entreprise.nom);
            try {
                System.out.println("Mission: " + entreprise.mission());
            } catch (SecretMissionException e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("Capital: " + entreprise.capital());
            } catch (NonProfitException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Entreprise[] liste = new Entreprise[6];

        liste[0] = new Entreprise(3000, 1000000, "RAM", "Transport aérien");
        liste[1] = new EntrepriseSecrete(5000, 500000, "CIA", "Entreprise Secrete");
        liste[2] = new EntrepriseSecrete(2000, 300000, "DGED", "Entreprise Secrete");
        liste[3] = new EntrepriseSansProfit(800, 0, "Croix-RougeMarocaine", "Aide humanitaire");
        liste[4] = new Entreprise(1000, 2000000, "Attijariwafa_Bank", "Services bancaires");
        liste[5] = new EntrepriseSansProfit(100, 0, "FMV_pour_la_Solidarité", "Solidarite");

        infoEntreprises(liste);
    }
}
