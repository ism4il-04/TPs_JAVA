package TP4.EX2;

public class Dictionnaire extends  Document{
    private int nbdefi;
    public Dictionnaire(int reference,String auteur, int nbdefi){
        super(reference, auteur);
        this.nbdefi = nbdefi;
    }
    @Override
    public void afficher() {
        System.out.println("Reference du dictionnaire : "+reference);
        System.out.println("Nom du dictionnaire : "+titre);
        System.out.println("Nombre de definitions de mots que le dictionnaire"+titre+ "contient : "+nbdefi);
    }
}
