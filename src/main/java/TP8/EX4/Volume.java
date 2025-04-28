package TP8.EX4;

public class Volume extends Document{
    protected String auteur;

    @Override
    public String toString() {
        return "Volume {titre=" + super.titre + ",auteur=" + auteur + "}";
    }
}
