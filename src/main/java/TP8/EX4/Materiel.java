package TP8.EX4;

public class Materiel {
    protected boolean enPanne;
    public Materiel(boolean enPanne) {
        this.enPanne = enPanne;
    }

    @Override
    public String toString() {
        return "Materiel {enPanne=" +  (enPanne ? "en Panne":"pas en panne") + "}";

    }
}
