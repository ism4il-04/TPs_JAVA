package TP8.EX2;

import java.util.*;

public class GestionBibliotheque {
    private HashMap<String, String> catalogue;
    private HashSet<String> membres;
    private Deque<String> listeAttenteLivres;

    public GestionBibliotheque() {
        catalogue = new HashMap<>();
        membres = new HashSet<>();
        listeAttenteLivres = new ArrayDeque<>();
    }

    public void ajouterLivre(){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le titre du livre : ");
        String titre = clavier.nextLine();
        System.out.print("Entrez l'auteur du livre : ");
        String auteur = clavier.nextLine();
        catalogue.put(titre, auteur);
    }
    public String trouverLivre() {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez titre du livre : ");
        String titre = clavier.nextLine();
        return catalogue.getOrDefault(titre, "Livre Inconnu");
    }

    public void inscrireMembre() {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le membre : ");
        String membre = clavier.nextLine();
        if (membres.contains(membre)) {
            System.out.println("Membre deja inscrit");
        } else {
            membres.add(membre);
        }
    }
    public void estMembre(){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le membre : ");
        String membre = clavier.nextLine();
        if (membres.contains(membre)) {
            System.out.println("Membre deja inscrit");
        } else {
            System.out.println("Membre inconnu");
        }
    }

    public void rejoindreListeAttente (){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le membre pour ajouter à la liste: ");
        String membre = clavier.nextLine();
        if (membres.contains(membre)) {
            listeAttenteLivres.addLast(membre);
        }else {
            System.out.println("cette personne n'est pas membre");
        }
    }
    public String preterLivre(){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le membre pour ajouter à la liste: ");
        String membre = clavier.nextLine();
        if (listeAttenteLivres.contains(membre)) {
            return listeAttenteLivres.removeFirst();
        } else {
            System.out.println("cette personne n'est pas dans la liste d'attente");
            return null;
        }
    }
    public void afficherListeAttente() {
        for (String e : listeAttenteLivres) {
            System.out.println(e);
        }
    }
}
