package TP8.EX4;

import java.util.List;

public class Bibliotheque {
    private List<Adherent> adherents;
    private List<Document> documents;
    private List<Materiel> materiels;

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
