package TP8.EX4;

public class BandeDessinee extends Volume{
    private String dessinateur;

    public BandeDessinee(String titre, String auteur, String dessinateur) {
        super(titre, auteur);
        this.dessinateur = dessinateur;
    }

    @Override
    public String toString() {
        return "Bande Dessinee {titre=" + super.titre + ",auteur="+super.auteur+", Dessinateur=" + dessinateur + "}";
    }
}
