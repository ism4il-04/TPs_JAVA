package TP4.EX3;

public class ReferenceBancaire {
    private int numeroClient; // Unique par banque
    private String nomTitulaire;
    private String prenomTitulaire;
    private String nomBanque;

    // Constructeur
    public ReferenceBancaire(int numeroClient, String nomTitulaire, String prenomTitulaire, String nomBanque) {
        this.numeroClient = numeroClient;
        this.nomTitulaire = nomTitulaire;
        this.prenomTitulaire = prenomTitulaire;
        this.nomBanque = nomBanque;
    }

    // Getters et Setters
    public int getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public String getPrenomTitulaire() {
        return prenomTitulaire;
    }

    public void setPrenomTitulaire(String prenomTitulaire) {
        this.prenomTitulaire = prenomTitulaire;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    @Override
    public String toString() {
        return "ReferenceBancaire{" +
                "numeroClient=" + numeroClient +
                ", nomTitulaire='" + nomTitulaire + '\'' +
                ", prenomTitulaire='" + prenomTitulaire + '\'' +
                ", nomBanque='" + nomBanque + '\'' +
                '}';
    }
}