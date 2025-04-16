package TP4.EX2;

public class Main {
    public static void main(String[] args) {
        // Création de la bibliothèque
        Bibliotheque bibliotheque = new Bibliotheque();

        // Création de documents
        Livre livre1 = new Livre(101, "Java Programming", "Victor", 500);
        Livre livre2 = new Livre(102, "SQL", "Elias", 395);
        Dictionnaire dictionnaire1 = new Dictionnaire(201, "Maroc Dictionary", 56654);
        Dictionnaire dictionnaire2 = new Dictionnaire(202, "Larousse Dictionary", 46489);

        // Ajout des documents à la bibliothèque
        bibliotheque.addDocument(livre1);
        bibliotheque.addDocument(livre2);
        bibliotheque.addDocument(dictionnaire1);
        bibliotheque.addDocument(dictionnaire2);

        // Test de l'affichage des dictionnaires
        System.out.println("Affichage des dictionnaires :");
        bibliotheque.afficherDictionnaire();

        // Test du calcul du nombre de livres
        System.out.println("\nNombre de livres dans la bibliothèque : " + bibliotheque.calculerNombreLivre());
    }
}
