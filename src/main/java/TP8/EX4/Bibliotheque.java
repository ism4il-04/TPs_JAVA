package TP8.EX4;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Adherent> adherents;
    private List<Document> documents;
    private List<Materiel> materiels;

    public Bibliotheque() {
        this.adherents = new ArrayList<Adherent>();
        this.documents = new ArrayList<Document>();
        this.materiels = new ArrayList<Materiel>();
    }

    public Bibliotheque(List<Adherent> adherents, List<Document> documents, List<Materiel> materiels) {
        this.adherents = adherents;
        this.documents = documents;
        this.materiels = materiels;
    }

    public boolean addAdherent(Adherent adherent){
        return adherents.add(adherent);
    };
    public boolean addDocument(Document document){
        return documents.add(document);
    };
    public boolean addMaterial(Materiel materiel){
        return materiels.add(materiel);
    };

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "adherents=" + adherents +
                ", Documents=" + documents+
                ", Materiels=" + materiels +
                '}';
    }
}
