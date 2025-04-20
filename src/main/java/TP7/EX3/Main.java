package TP7.EX3;

public class Main {
    public static void main(String[] args) {
        CompteBancaire c1 = new CompteBancaire(5);
        CompteBancaire c2 = new CompteBancaire(10);
        try {
            c1.deposit(-10);
        } catch (MontantInvalideException e) {
            System.out.println(e.getMessage());
        }
        try {
            c2.retire(11);
        }
        catch (SoldeInsuffisantException e){
            System.out.println(e.getMessage());
        }
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
