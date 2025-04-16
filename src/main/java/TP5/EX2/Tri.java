package TP5.EX2;

public class Tri {
    static void triBulles(Triable t) {
        boolean change;
        do {
            change = false;
            for (int i = 0; i < t.taille() - 1; i++) {
                if (t.plusGrand(i, i + 1)) {
                    t.echange(i, i + 1);
                    change = true;
                }
            }
        } while (change);
    }
}
