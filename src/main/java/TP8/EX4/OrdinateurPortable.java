package TP8.EX4;

public class OrdinateurPortable extends Materiel implements Empruntable {
    private String marque;
    private Os os;

    public OrdinateurPortable(boolean enPanne, String marque, Os os) {
        super(enPanne);
        this.marque = marque;
        this.os = os;
    }

    @Override
    public boolean isDisponible() {
        return false;
    }

    @Override
    public String toString() {
        return "Ordinateur {materiel="+ (super.enPanne ? "en panne": "pas en panne") + ",marque: "+marque+", os:"+ os + "}";
    }
}
