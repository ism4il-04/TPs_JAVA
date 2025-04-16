package TP5.EX2;

public class Rectangle extends Figure implements Deformable, symetrie{
    protected int largeur;
    protected int hauteur;

    public Rectangle(int x, int y, int largeur, int hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle : Centre (" + getPosX() + ", " + getPosY() + "), Largeur = " + largeur + ", Hauteur = " + hauteur);
    }

    @Override
    public double surface() {
        return largeur * hauteur;
    }

    @Override
    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    @Override
    public Figure deformation(double coeffH, double coeffV) {
        return new Rectangle(getPosX(), getPosY(), (int) (largeur * coeffH), (int) (hauteur * coeffV));
    }

    @Override
    public Figure symetrieAxiale(String axe) {
        if (axe.equals("X")) {
            return new Rectangle(getPosX(), -getPosY(), largeur, hauteur);
        } else if (axe.equals("Y")) {
            return new Rectangle(-getPosX(), getPosY(), largeur, hauteur);
        }
        return this;
    }
}
