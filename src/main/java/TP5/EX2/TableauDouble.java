package TP5.EX2;

public class TableauDouble implements Triable {
    private double[] tab;

    public TableauDouble(double[] tab) {
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
        double temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }

    public void afficher() {
        for (double val : tab) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}