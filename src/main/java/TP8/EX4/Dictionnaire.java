package TP8.EX4;

public class Dictionnaire extends Volume{
    private String theme;

    public Dictionnaire(String titre, String auteur, String theme) {
        super(titre, auteur);
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Dictionnaire {titre=" + super.titre + ",auteur="+super.auteur+", theme=" + theme + "}";
    }
}
