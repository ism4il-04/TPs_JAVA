package TP8.EX4;

public class Livre extends Volume implements Empruntable {
    @Override
    public boolean isDisponible() {
        return false;
    }

    @Override
    public String toString() {
        return "Livre {titre=" + super.titre + ",auteur="+super.auteur+ "}";
    }

}
