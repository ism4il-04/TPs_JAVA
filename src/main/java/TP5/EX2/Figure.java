package TP5.EX2;

public abstract class Figure {
    private int posX;
    private int posY;

    public Figure(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public abstract void affiche();
    public abstract double surface();
    public abstract double perimetre();

    public void deplacement(int dx, int dy) {
        this.posX += dx;
        this.posY += dy;
    }

    public double estDistantDe(Figure fig) {
        int dx = fig.getPosX() - this.getPosX();
        int dy = fig.getPosY() - this.getPosY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

// Interfaces symétrie et déformable
interface symetrie {
    Figure symetrieAxiale(String axe);
}

interface Deformable {
    Figure deformation(double coeffH, double coeffV);
}

