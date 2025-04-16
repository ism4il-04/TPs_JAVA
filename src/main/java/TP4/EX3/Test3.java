package TP4.EX3;

public class Test3 {
    public static void main(String[] args) {
        // Test de la classe Technicien (avec Prime en raison du risque)
        Technicien technicienARisque = new Technicien("Dupuis", "Claire", 40, 12, 150, 900.0, 0.15, 12.0);
        System.out.println("----- Technicien à Risque -----");
        technicienARisque.afficher();
        System.out.println("Salaire calculé (avec prime de risque) : " + (technicienARisque.calculerSalaire() + technicienARisque.getPrime()));
        // Test de la classe Manutentionnaire (avec Prime en raison du risque)
        Manutentionnaire manutentionnaireARisque = new Manutentionnaire("Giraud", "Alex", 30, 5, 160, 10.0);
        System.out.println("\n----- Manutentionnaire à Risque -----");
        manutentionnaireARisque.afficher();
        System.out.println("Salaire calculé (avec prime de risque) : " + (manutentionnaireARisque.calculerSalaire() + manutentionnaireARisque.getPrimeRisque()));
    }
}

