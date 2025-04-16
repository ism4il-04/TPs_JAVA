package TP5.EX2;

public class Triangle extends Figure {
    private int base;
    private int hauteur;

    public Triangle(int x, int y, int base, int hauteur) {
        super(x, y);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public void affiche() {
        System.out.println("Triangle : Centre (" + getPosX() + ", " + getPosY() + "), Base = " + base + ", Hauteur = " + hauteur);
    }

    @Override
    public double surface() {
        return (base * hauteur) / 2.0;
    }

    @Override
    public double perimetre() {
        double cote = Math.sqrt((base / 2.0) * (base / 2.0) + hauteur * hauteur);
        return base + 2 * cote;
    }
}

