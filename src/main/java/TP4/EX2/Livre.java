package TP4.EX2;

public class Livre extends Document {
    private String auteur;
    private int nombrePages;
    public Livre(int reference, String titre, String auteur, int nombrePages) {
        super(reference, titre);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }
    @Override
    public void afficher() {
        System.out.println("Refenrence du livre :" + reference);
        System.out.println("Titre du livre :" + titre);
        System.out.println("Auteur du livre :" + auteur);
        System.out.println("Nombre de pages du livre :" + nombrePages);
    }
}
