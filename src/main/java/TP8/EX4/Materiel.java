package TP8.EX4;

public class Materiel {
    private boolean enPanne;

    @Override
    public String toString() {
        return "Materiel {enPanne=" +  (enPanne ? "en Panne":"pas en panne") + "}";

    }
}
