package TP8.EX4;

public class Dictionnaire extends Volume{
    private String theme;

    @Override
    public String toString() {
        return "Dictionnaire {titre=" + super.titre + ",auteur="+super.auteur+", theme=" + theme + "}";
    }
}
