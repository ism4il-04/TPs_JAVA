package TP5.EX2;

public class Test_Figure {
    public static void main(String[] args) {
        // Test des figures
        Rectangle rectangle = new Rectangle(0, 0, 15, 30);
        rectangle.affiche();
        System.out.println("Surface du rectangle : " + rectangle.surface());
        System.out.println("Périmètre du rectangle : " + rectangle.perimetre());

        Carre carre = new Carre(0, 0, 10);
        carre.affiche();
        System.out.println("Surface du carré : " + carre.surface());
        System.out.println("Périmètre du carré : " + carre.perimetre());

        Triangle triangle = new Triangle(0, 0, 13, 4);
        triangle.affiche();
        System.out.println("Surface du triangle : " + triangle.surface());
        System.out.println("Périmètre du triangle : " + triangle.perimetre());

        Cercle cercle = new Cercle(0, 0, 8);
        cercle.affiche();
        System.out.println("Surface du cercle : " + cercle.surface());
        System.out.println("Périmètre du cercle : " + cercle.perimetre());
    }
}
