package Exercice.n1;

public class Adresse {
    private String rue;
    private String ville;
    private String codePostal;

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Adresse(String codePostal, String ville, String rue) {
        this.codePostal = codePostal;
        this.ville = ville;
        this.rue = rue;
    }
}
