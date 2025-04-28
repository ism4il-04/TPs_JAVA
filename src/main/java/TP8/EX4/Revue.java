package TP8.EX4;

public class Revue extends Document{
    private int numero;

    @Override
    public String toString() {
        return "Revue {titre=" + super.titre + ", numero=" + numero + "}";
    }
}
