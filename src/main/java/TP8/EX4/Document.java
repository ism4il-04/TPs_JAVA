package TP8.EX4;

public class Document {
    protected String titre;

    public Document(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document {titre=" + titre + "}";
    }
}
