package TP8.EX4;

public class OrdinateurPortable extends Materiel implements Empruntable {
    private String marque;
    Os os;

    @Override
    public boolean isDisponible() {
        return false;
    }

    @Override
    public String toString() {
        return "Ordinateur {materiel="+ (super.enPanne ? "en panne": "pas en panne") + ",marque: "+marque+", os:"+ os + "}";
    }
}
