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

    public void ajouterLivre(String titre, String auteur) {
        catalogue.put(titre, auteur);
        System.out.println("Ajout de livre: " + titre + " par " + auteur + " a la bibliotheque.");
    }
    public String trouverAuteur(String titre) {
        System.out.println("Recherche de l'auteur du livre: " + titre );
        return catalogue.getOrDefault(titre, "Livre Inconnu");
    }

    public void inscrireMembre(String membre) {
        if (membres.contains(membre)) {
            System.out.println("Membre deja inscrit");
        } else {
            System.out.println("Ajout de nouveau membre: " + membre + " a la bibliotheque.");
            membres.add(membre);
        }
    }
    public void estMembre(String membre){
        if (membres.contains(membre)) {
            System.out.println("Membre deja inscrit");
        } else {
            System.out.println("Membre inconnu");
        }
    }

    public void rejoindreListeAttente (String membre){
        if (membres.contains(membre)) {
            System.out.println("Ajout de membre: "+membre+" a la liste d'attente ");
            listeAttenteLivres.addLast(membre);
        }else {
            System.out.println("cette personne '"+membre+"' n'est pas membre");
        }
    }
    public String preterLivre(){
            return listeAttenteLivres.removeFirst();
    }
    public void afficherListeAttente() {
        System.out.println("\nListe d'attente:");
        for (String e : listeAttenteLivres) {
            System.out.println(e);
        }
        System.out.println("fin liste d'attente\n");
    }
}
