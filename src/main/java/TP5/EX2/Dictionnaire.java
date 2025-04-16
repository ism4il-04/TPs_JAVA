package TP5.EX2;

public class Dictionnaire implements Triable {
    private String[] mots;

    public Dictionnaire(String[] mots) {
        this.mots = mots;
    }

    @Override
    public int taille() {
        return mots.length;
    }

    @Override
    public boolean plusGrand(int i, int j) {
        return mots[i].compareTo(mots[j]) > 0;
    }

    @Override
    public void echange(int i, int j) {
        String temp = mots[i];
        mots[i] = mots[j];
        mots[j] = temp;
    }

    @Override
    public String toString() {
        return String.join(", ", mots);
    }
}
