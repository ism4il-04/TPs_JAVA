package TP7.EX3;

public class CompteBancaire {
    private double solde;
    public CompteBancaire(double solde) {
        this.solde = solde;
    }
    public void deposit(double deposit) throws MontantInvalideException {
        if (deposit < 0) {
            throw new MontantInvalideException("montant negtaif");
        }
        this.solde = this.solde + deposit;
    }
    public void retire(double retire) throws SoldeInsuffisantException {
        if(retire>this.solde){
            throw new SoldeInsuffisantException("Solde insuffisant");
        }
        this.solde = this.solde-retire;
    }

    @Override
    public String toString() {
        return "CompteBancaire {" +
                "solde=" + solde +
                '}';
    }
}
