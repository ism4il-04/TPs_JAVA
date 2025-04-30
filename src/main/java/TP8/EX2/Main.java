package TP8.EX2;

public class Main {
    public static void main(String[] args) {
        GestionBibliotheque G=new GestionBibliotheque();
        //1)
        G.ajouterLivre("Livre 1","Sefrioui");
        System.out.println(G.trouverAuteur("Livre 1"));
        System.out.println(G.trouverAuteur("Livre 2"));

        //2)
        G.inscrireMembre("Ismail");
        G.inscrireMembre("Yassine");
        G.inscrireMembre("Younes");
        G.inscrireMembre("Ali");
        G.estMembre("Najibe");
        G.estMembre("Ismail");

        //3)
        G.rejoindreListeAttente("Younes");
        G.rejoindreListeAttente("Yassine");
        G.rejoindreListeAttente("Houda");
        G.rejoindreListeAttente("Ismail");
        G.rejoindreListeAttente("Ali");
        G.afficherListeAttente();
        System.out.println("Retirer membre: '"+G.preterLivre()+"' de la liste d'attente");
        System.out.println("Retirer membre: '"+G.preterLivre()+"' de la liste d'attente");
        G.afficherListeAttente();
    }
}
