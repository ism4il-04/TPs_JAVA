package Exercice.n3;

public class Main {
    public static void main(String[] args) {
        EnsembleTableau ensemble1 = new EnsembleTableau();
        ensemble1.ajouter(1);
        ensemble1.ajouter(3);
        ensemble1.ajouter(5);
        ensemble1.afficher();

        EnsembleTableau ensemble2 = new EnsembleTableau();
        ensemble2.ajouter(3);
        ensemble2.ajouter(4);
        ensemble2.ajouter(5);
        ensemble2.ajouter(6);
        ensemble2.afficher();

        ensemble2.supprimer(6);
        ensemble2.afficher();

        System.out.println("Union:");
        ensemble1.union(ensemble2);
        ensemble1.afficher();

        System.out.println("Intersection:");
        ensemble1.intersection(ensemble2);
        ensemble1.afficher();

        System.out.println("Comparaison: " + ensemble1.comparer(ensemble2));

        System.out.println("Scinder ensemble1:");
        EnsembleTableau ensemble3 = ensemble1.scinder();
        ensemble1.afficher();
        ensemble3.afficher();
    }
}

