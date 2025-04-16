package TP6.IHM;

import TP6.DAO.Livre;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GestionLivres extends JFrame {

    private JPanel MainPanel;
    private JPanel FormPanel;
    private JPanel SearchPanel;
    private JPanel ListPanel;
    private JTextField txt_titre;
    private JTextField txt_isbn;
    private JTextField txt_nbexmp;
    private JTextField txt_auteur;
    private JComboBox cbox_domain;
    private JSpinner date_production;
    private JButton enregistrerButton;
    private JButton modifierButton;
    private JButton supprimerButton;
    private JButton annulerButton;
    private JButton listesDesExemplairesButton;
    private JComboBox rech_Domaine;
    private JButton RechercheISBNN;
    private JButton RechercheDomaine;
    private JButton RechercheNom;
    private JButton afficherTous;
    private JTable Booklistes;
    private JTextField rech_isbn;
    private JTextField rech_Nom;

    public GestionLivres(){
        setContentPane(MainPanel);
        setTitle("Gestion des livres");
        setDefaultCloseOperation((javax.swing.JFrame.EXIT_ON_CLOSE));
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);


        // Créer un modèle avec les colonnes et sans lignes
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ISBNN", "Titre", "Date de Parution", "Nb Exemplaire", "Auteur", "Domaine"}
        );

        Booklistes.setModel(model); // Appliquer le modèle à jTable1
        // Configurer le JSpinner pour les dates
        SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), null, null, java.util.Calendar.DAY_OF_MONTH);
        date_production.setModel(dateModel);
        date_production.setEditor(new JSpinner.DateEditor(date_production, "yyyy-MM-dd"));

        SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int isbn = Integer.parseInt(txt_isbn.getText());
                String titre = txt_titre.getText();
                String dateParution = formater.format((Date) date_production.getValue());
                int nbExemplaire=Integer.parseInt(txt_nbexmp.getText());
                String auteur = txt_auteur.getText();
                String domaine = cbox_domain.getSelectedItem().toString();
                Livre l=new Livre(isbn, titre, dateParution, nbExemplaire, auteur, domaine);
                l.Ajouter(l);
                JOptionPane.showMessageDialog(null,"ajouté avec succes","insertion",JOptionPane.INFORMATION_MESSAGE);
                Booklistes.removeAll();
                Actualiser();
                vider();
            }
        });

        supprimerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int isbn = Integer.parseInt(txt_isbn.getText());
                Livre l= new Livre();
                int test=JOptionPane.showConfirmDialog(null,"Voullez vous supprimer",
                        "oui",JOptionPane.YES_NO_OPTION);

                if(test==0){
                l.Supprimer(isbn);
                JOptionPane.showMessageDialog(null,"Supprimer avec succés",
                        "suppression",JOptionPane.INFORMATION_MESSAGE);
                Booklistes.removeAll();
                Actualiser();
                vider();
                }
            }
        });
        modifierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Livre l= new Livre();
                int isbn=Integer.parseInt(txt_isbn.getText());
                String titre = txt_titre.getText();
                String dateParution = formater.format((Date) date_production.getValue());
                int nbExemplaire=Integer.parseInt(txt_nbexmp.getText());
                String auteur = txt_auteur.getText();
                String domaine = cbox_domain.getSelectedItem().toString();
                int test=JOptionPane.showConfirmDialog(null,"Voulez vous modifier?",
                        "oui",JOptionPane.YES_NO_OPTION);
                if(test==0) {
                    l.Modifier(isbn,titre,dateParution,nbExemplaire,auteur,domaine);
                    JOptionPane.showMessageDialog(null, "Modifié avec succés",
                            "Modification", JOptionPane.INFORMATION_MESSAGE);
                    Booklistes.removeAll();
                    Actualiser();
                    vider();
                }
            }
        });
        annulerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vider();
                Actualiser();
            }
        });
        RechercheISBNN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int isbn = Integer.parseInt(rech_isbn.getText());
                ActualiserISBN(isbn);
            }
        });
        RechercheDomaine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String domaine = rech_Domaine.getSelectedItem().toString();
                ActualiserDomaine(domaine);
            }
        });
        RechercheNom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String auteur = rech_Nom.getText();
                ActualiserAuteur(auteur);
            }
        });
        afficherTous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualiser();
            }
        });
    }

    public void vider (){
        txt_isbn.setText("");
        txt_nbexmp.setText("");
        txt_auteur.setText("");
        txt_titre.setText("");
        cbox_domain.setSelectedItem("");
    }
    String[][] tab;
    public void Actualiser(){
        Livre l=new Livre();
        int i=0;
        List<Livre> livres=l.getAllLivre();
        RemplirTable(i, livres);
    }
    public void ActualiserISBN(int isbn){
        Livre l=new Livre();
        int i=0;
        List<Livre> livres=l.afficherparISBN(isbn);
        RemplirTable(i, livres);
    }
    public void ActualiserAuteur(String auteur){
        Livre l=new Livre();
        int i=0;
        List<Livre> livres=l.afficherparAuteur(auteur);
        RemplirTable(i, livres);
    }
    public void ActualiserDomaine(String domaine){
        Livre l=new Livre();
        int i=0;
        List<Livre> livres=l.afficherparDomaine(domaine);
        RemplirTable(i, livres);
    }
    private void RemplirTable(int i, List<Livre> livres) {
        tab = new String[livres.size()][6];
        for (Livre livre : livres){
            tab[i][0]=""+livre.isbn;
            tab[i][1]=livre.titre;
            tab[i][2]=livre.dateParution;
            tab[i][3]= ""+livre.nbExemplaire;
            tab[i][4]=livre.auteur;
            tab[i][5]=livre.domaine;
            i++;
        }
        String [] entet= new String[]{"ISBNN", "Titre", "Date de Parution", "Nb Exemplaire", "Auteur", "Domaine"};
        Booklistes.setModel(new DefaultTableModel(tab,entet));
    }


    public static void main(String[] args){
        GestionLivres n =new GestionLivres();
    }

}
