package TP7.EX2;

public class EntrepriseSansProfit extends Entreprise {

    public EntrepriseSansProfit(int nombreEmployes, int capital, String nom, String mission) {
        super(nombreEmployes, capital, nom, mission);
    }

    @Override
    public int capital() throws NonProfitException {
        throw new NonProfitException("cette entreprise n'a pas de profit.\n");
    }
}
