package TP4.EX2;

public class Document {
    protected   int reference;
    protected   String titre;
    public Document(int reference, String titre) {
        this.reference = reference;
        this.titre = titre;
    }
    void afficher() {
        System.out.println("Refenrence du livre :" + reference);
        System.out.println("Titre du livre :" + titre);
    }
}
