package TP7.EX2;

public class EntrepriseSansProfit extends Entreprise {

    public EntrepriseSansProfit(int nombreEmployes, int capital, String nom, String mission) {
        super(nombreEmployes, capital, nom, mission);
    }

    public int capital() throws NonProfitException {
        if (capital == 0){
            throw new NonProfitException("cette entreprise n'a pas de profit.");
        }
        return capital;
    }
}
