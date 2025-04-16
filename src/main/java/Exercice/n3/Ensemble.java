package Exercice.n3;
import java.util.Arrays;

class EnsembleTableau {
    private int[] elements;
    private int taille;
    private static final int CAPACITE_INITIALE = 10;

    public EnsembleTableau() {
        elements = new int[CAPACITE_INITIALE];
        taille = 0;
    }

    public void ajouter(int e) {
        if (contient(e)) return;
        if (taille == elements.length) {
            elements = Arrays.copyOf(elements, taille * 2);
        }
        elements[taille++] = e;
    }

    public void supprimer(int e) {
        for (int i = 0; i < taille; i++) {
            if (elements[i] == e) {
                elements[i] = elements[--taille];
                return;
            }
        }
    }

    public void afficher() {
        System.out.print("Ensemble: ");
        for (int i = 0; i < taille; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void union(EnsembleTableau autre) {
        for (int i = 0; i < autre.taille; i++) {
            ajouter(autre.elements[i]);
        }
    }

    public void intersection(EnsembleTableau autre) {
        int[] temp = new int[taille];
        int newSize = 0;
        for (int i = 0; i < taille; i++) {
            if (autre.contient(elements[i])) {
                temp[newSize++] = elements[i];
            }
        }
        elements = Arrays.copyOf(temp, newSize);
        taille = newSize;
    }

    public EnsembleTableau scinder() {
        EnsembleTableau autre = new EnsembleTableau();
        int miTaille = taille / 2;
        for (int i = miTaille; i < taille; i++) {
            autre.ajouter(elements[i]);
        }
        taille = miTaille;
        return autre;
    }

    public int comparer(EnsembleTableau autre) {
        return Integer.compare(this.taille, autre.taille);
    }

    private boolean contient(int e) {
        for (int i = 0; i < taille; i++) {
            if (elements[i] == e) return true;
        }
        return false;
    }
}