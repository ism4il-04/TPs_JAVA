package TP8.EX4;

public class Volume extends Document{
    protected String auteur;

    public Volume(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Volume {titre=" + super.titre + ",auteur=" + auteur + "}";
    }
}
