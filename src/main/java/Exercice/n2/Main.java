package Exercice.n2;

public class Main {
    public static void main(String[] args) {
        MaDate date1 = new MaDate(28,2,2100);
        MaDate date2 = new MaDate(28,2,2025);
        MaDate date3 = new MaDate(30,4,2024);
        MaDate date4 = new MaDate(31,12,2024);
        MaDate date5 = new MaDate(17,4,2024);
        MaDate date6 = new MaDate(28,2,2024);
        System.out.print(date1+" --1--> ");
        date1.ajouterUnJour();
        System.out.println(date1);
        System.out.print(date2+" --1--> ");
        date2.ajouterUnJour();
        System.out.println(date2);
        System.out.print(date3+" --1--> ");
        date3.ajouterUnJour();
        System.out.println(date3);
        System.out.print(date4+" --1--> ");
        date4.ajouterUnJour();
        System.out.println(date4);
        System.out.print(date5+" --20--> ");
        date5.ajouterPlusieursJours(20);
        System.out.println(date5);
        System.out.print(date6+" --5--> ");
        date6.ajouterPlusieursJours(5);
        System.out.println(date6);
    }
}
