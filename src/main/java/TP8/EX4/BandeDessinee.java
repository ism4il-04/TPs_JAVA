package TP8.EX4;

public class BandeDessinee extends Volume{
    private String dessinateur;

    @Override
    public String toString() {
        return "Bande Dessinee {titre=" + super.titre + ",auteur="+super.auteur+", Dessinateur=" + dessinateur + "}";
    }
}
