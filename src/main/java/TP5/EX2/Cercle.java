package TP5.EX2;

public class Cercle extends Figure implements Deformable {
    private int rayon;

    public Cercle(int x, int y, int rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        System.out.println("Cercle : Centre (" + getPosX() + ", " + getPosY() + "), Rayon = " + rayon);
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public Figure deformation(double coeffH, double coeffV) {
        return new Cercle(getPosX(), getPosY(), (int) (rayon * coeffH));
    }
}
