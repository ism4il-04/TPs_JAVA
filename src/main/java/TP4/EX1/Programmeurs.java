package TP4.EX1;

import java.util.Scanner;

public class Programmeurs {
    private int ID;
    private String nom;
    private String prenom;
    private  int bureau;
    private Consos_Cafe[] Tab_consos;
    public Programmeurs(int ID, String nom, String prenom, int bureau, Consos_Cafe[] tab_consos) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
        Tab_consos = tab_consos;
    }

    public int getID() {return ID;}
    public int getBureau() {return bureau;}
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public Consos_Cafe[] getTab_consos() {return Tab_consos;}

    public void setID(int ID) {this.ID = ID;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBureau(int bureau) {
        this.bureau = bureau;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "\nId: "+ID+" | Nom: "+nom+"| Prenom: "+prenom+"| Bureau: "+bureau+"\n";
    }
    public void afficher() {
        System.out.println("Id: "+this.ID+" | Nom: "+this.nom+"| Prenom: "+this.prenom+"| Bureau: "+this.bureau);
    }
}
