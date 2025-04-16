package Exercice.n1;

public class ListePersonnes {
    public Personne[] personnes = new Personne[10];

    public Personne[] getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }

    public ListePersonnes(Personne[] personnes) {
        this.personnes = personnes;
    }
    public Personne findByNom(String nom) {
        for (Personne p : personnes) {
            if (p.getNom().equals(nom)) {
                return p;
            }
        }
        return null;
    }
    public boolean findByCodePostal(String cp){
        for (Personne p : personnes) {
            for (int i = 0; i < p.getAdresses().length; i++) {
                if (p.getAdresses()[i].getCodePostal().equals(cp)) {
                    return true;
                }
            }

        }
        return false;
    }
    public int countPersonneVille (String ville){
        int count = 0;
        for (Personne p : personnes) {
            for (int i = 0; i < p.getAdresses().length; i++) {
                if(p.getAdresses()[i].getVille().equals(ville)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public void editPersonneNom(String oldNom, String newNom){
        for (Personne p : personnes) {
            if (p.getNom().equals(oldNom)) {
                p.setNom(newNom);
            }
        }
    }
    public void editPersonneVille(String nom, String newVille){
        for (Personne p : personnes) {
            for (int i = 0; i < p.getAdresses().length; i++) {
                if (p.getAdresses()[i].getVille().equals(nom)) {
                    p.getAdresses()[i].setVille(newVille);
                }
            }
        }
    }
    public void afficherListePersonnes(){
        for (Personne p : personnes) {
            System.out.println("---------------------------------------");
            System.out.println("Nom: " + p.getNom() + " Sexe: "+p.getSexe());
            System.out.println("Ses adresses:");
            for(int i=0;i<p.getAdresses().length;i++) {
                System.out.println("Adresse n°"+(i+1)+": "+ p.getAdresses()[i].getVille()+","+p.getAdresses()[i].getRue()+","+p.getAdresses()[i].getCodePostal());
            }
            System.out.println("---------------------------------------");
        }
    }
}
