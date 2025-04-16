package TP5.EX2;

public class Carre extends Rectangle {
    public Carre(int x, int y, int cote) {
        super(x, y, cote, cote);
    }
    @Override
    public void affiche() {
        System.out.println("Carré : Centre (" + getPosX() + ", " + getPosY() + "), Côté = " + largeur);
    }
}
