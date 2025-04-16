package TP4.EX1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListeProgrammeurs {
    List<Programmeurs>  programmeurs;

    public ListeProgrammeurs() {
        programmeurs = new ArrayList<>();
    }
    public void ajouter(int ID, int bureau, String prenom, String nom,Consos_Cafe[] tab_consos) {
        Programmeurs P = new Programmeurs(ID,nom,prenom,bureau,tab_consos);
        programmeurs.add(P);
    }

    public void afficherListeProgrammeurs(){
        System.out.println("Liste des programmeurs :"+programmeurs);
    }

    public int indexNom(String nom){
        int index = -1;
        for (int i = 0; i < programmeurs.size(); i++) {
            if (programmeurs.get(i).getNom().equals(nom)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int indexId(int ID){
        int index = -1;
        for (int i = 0; i < programmeurs.size(); i++) {
            if (programmeurs.get(i).getID() == ID) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void supprimerProgrammeur(int index){
        programmeurs.remove(index);
    }

    public void afficherTabTrie(){
        List<Programmeurs>sortedListe = new ArrayList<>();
        int n=programmeurs.size();
        Programmeurs[] filtered = new Programmeurs[n];
        int[] nbTasses = new int[n];
        int count = 0;
        Programmeurs tmp;
        System.out.println("donner le no_semaine : ");
        Scanner clavier = new Scanner(System.in);
        int no_semaine = clavier.nextInt();
        for (Programmeurs programmeur : programmeurs){
            for (Consos_Cafe consommation : programmeur.getTab_consos()) {
                if (consommation.getNo_Semain() == no_semaine) {
                    filtered[count] = programmeur;
                    nbTasses[count] = consommation.getNbTasses();
                    count++;
                }
            }
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (nbTasses[j] < nbTasses[j + 1]) {
                    // Swap Nb_tasse values
                    int tempTasse = nbTasses[j];
                    nbTasses[j] = nbTasses[j + 1];
                    nbTasses[j + 1] = tempTasse;

                    // Swap corresponding Programmeur objects
                    Programmeurs tempProg = filtered[j];
                    filtered[j] = filtered[j + 1];
                    filtered[j + 1] = tempProg;
                }
            }
        }
        System.out.println("Programmeurs pour la semaine " + no_semaine + " triés par consommation de tasses :");
        for (int i = 0; i < count; i++) {
            System.out.println(filtered[i].getNom() + " " + filtered[i].getPrenom() + " - " + nbTasses[i] + " tasses");
        }
    }

    public int afficherNbTasses(List<Programmeurs> p) {
        int sum=0;
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < p.get(i).getTab_consos().length; j++) {
                sum +=p.get(i).getTab_consos()[j].getNbTasses();
            }
        }
        return sum;
    }

    public void modifierBureau(int index, int bureau){
        programmeurs.get(index).setBureau(bureau);
    }
}
