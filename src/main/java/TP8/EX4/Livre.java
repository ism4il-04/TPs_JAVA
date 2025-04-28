package TP8.EX4;

public class Livre extends Volume implements Empruntable {
    @Override
    public boolean isDisponible() {
        return false;
    }
}
