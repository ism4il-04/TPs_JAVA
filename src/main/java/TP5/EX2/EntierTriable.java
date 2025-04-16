package TP5.EX2;

public class EntierTriable implements Triable {
    private int[] tab;

    public  EntierTriable(int[] tab) {
        this.tab = tab;
    }

    @Override
    public int taille() {
        return tab.length;
    }

    @Override
    public boolean plusGrand(int i, int j) {
        return tab[i] > tab[j];
    }

    @Override
    public void echange(int i, int j) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    public void afficher() {
        for (int val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
