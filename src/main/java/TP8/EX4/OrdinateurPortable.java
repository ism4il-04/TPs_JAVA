package TP8.EX4;

public class OrdinateurPortable implements Empruntable {
    private String marque;
    Os os;

    @Override
    public boolean isDisponible() {
        return false;
    }
}
