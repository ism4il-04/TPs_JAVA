package TP5.EX1;
import java.util.ArrayList;
import java.util.List;

public class ListeObjet<T> {
    // Une liste générique pour stocker les objets
    private List<T> liste;

    // Constructeur pour initialiser la liste
    public ListeObjet() {
        this.liste = new ArrayList<>();
    }

    // Méthode pour ajouter un objet à la liste
    public void ajouterObjet(T objet) {
        liste.add(objet);
        System.out.println("Objet ajouté : " + objet);
    }

    // Méthode pour supprimer un objet de la liste (par référence)
    public boolean supprimerObjet(T objet) {
        if (liste.contains(objet)) {
            liste.remove(objet);
            System.out.println("Objet supprimé : " + objet);
            return true;
        } else {
            System.out.println("Objet non trouvé dans la liste : " + objet);
            return false;
        }
    }

    // Méthode pour récupérer un objet par son index
    public T obtenirObjet(int index) {
        if (index >= 0 && index < liste.size()) {
            return liste.get(index);
        } else {
            System.out.println("Index invalide !");
            return null;
        }
    }

    // Méthode pour appeler size() sur la liste : renvoie le nombre d'objets dans la liste
    public int taille() {
        return liste.size();
    }

    // Méthode pour vérifier si un objet existe dans la liste
    public boolean contient(T objet) {
        return liste.contains(objet);
    }

    // Méthode pour vider complètement la liste
    public void vider() {
        liste.clear();
        System.out.println("Liste vidée !");
    }

    // Méthode pour afficher tous les objets
    public void afficherListe() {
        if (liste.isEmpty()) {
            System.out.println("La liste est vide.");
        } else {
            System.out.println("Contenu de la liste :");
            for (int i = 0; i < liste.size(); i++) {
                System.out.println((i + 1) + ". " + liste.get(i));
            }
        }
    }
    public static void afficherEnseignants(ListeObjet<?> listeObjet) {
        System.out.println("\n===== Liste des enseignants =====");
        for (int i = 0; i < listeObjet.taille(); i++) {
            Object objet = listeObjet.obtenirObjet(i); // On récupère chaque objet depuis la liste
            if (objet instanceof Enseignant) { // Vérifie si l'objet est une instance de Enseignant
                System.out.println(objet); // Affiche l'objet (toString() sera utilisé automatiquement)
            }
        }
    }
}
