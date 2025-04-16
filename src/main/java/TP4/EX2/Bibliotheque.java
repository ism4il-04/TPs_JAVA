package TP4.EX2;

import java.util.List;
import java.util.ArrayList;

public class Bibliotheque {
    private List<Document> documents;
    public Bibliotheque() {
        documents = new ArrayList<>();
    }
    public void addDocument(Document document) {
        documents.add(document);
    }
    public int calculerNombreLivre() {
        int nombreLivre = 0;
        for (Document d : documents) {
            if (d instanceof Livre){
                nombreLivre++;
            }
        }
        return nombreLivre;
    }
    public void afficherDictionnaire(){
        for (Document d : documents) {
            if (d instanceof Dictionnaire){
                d.afficher();
            }
        }
    }
}
