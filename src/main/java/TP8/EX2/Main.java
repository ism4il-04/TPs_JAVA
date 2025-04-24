package TP8.EX2;

public class Main {
    public static void main(String[] args) {
        GestionBibliotheque G=new GestionBibliotheque();
        G.ajouterLivre();
        System.out.println(G.trouverLivre());
        G.inscrireMembre();
        G.inscrireMembre();
        G.inscrireMembre();
        G.estMembre();
    }
}
