package TP4.EX1;

public class Main {
    public static void main(String[] args) {
        ListeProgrammeurs listeProgrammeurs = new ListeProgrammeurs();
        Consos_Cafe[] consos1 = {new Consos_Cafe(1, 5), new Consos_Cafe(2, 7)};
        Consos_Cafe[] consos2 = {new Consos_Cafe(1, 3), new Consos_Cafe(2, 6)};
        Consos_Cafe[] consos3 = {new Consos_Cafe(1, 8), new Consos_Cafe(2, 4)};
        listeProgrammeurs.ajouter(101, 10, "Ismail", "Lyamani", consos1);
        listeProgrammeurs.ajouter(102, 12, "Karim", "El Amrani", consos2);
        listeProgrammeurs.ajouter(103, 15, "Najibe", "Touhami", consos3);
        System.out.println("Avant tri :");
        listeProgrammeurs.afficherListeProgrammeurs();
        System.out.println("Tri:");
        listeProgrammeurs.afficherTabTrie();
        int totalCafes = listeProgrammeurs.afficherNbTasses(listeProgrammeurs.programmeurs);
        System.out.println("\nNombre total de tasses consommées : " + totalCafes);
        int index = listeProgrammeurs.indexNom("Bennani");
        if (index != -1) {
            listeProgrammeurs.modifierBureau(index, 20);
            System.out.println("\nAprès modification du bureau :");
            listeProgrammeurs.afficherListeProgrammeurs();
        }
    }
}
