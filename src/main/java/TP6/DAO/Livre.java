package TP6.DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Livre {
    public int isbn;
    public String titre;
    public String dateParution;
    public int nbExemplaire;
    public String auteur;
    public String domaine;

    public Livre(){
    }

    public Livre(int isbn, String titre, String dateParution, int nbExemplaire, String auteur, String domaine) {
        this.isbn = isbn;
        this.titre = titre;
        this.dateParution = dateParution;
        this.nbExemplaire = nbExemplaire;
        this.auteur = auteur;
        this.domaine = domaine;
    }
    public void Ajouter(Livre l){
        try {
            Statement stm = ConnexionBD.seConnecter();
            stm.executeUpdate(("insert into livre values("+this.isbn+",'"
                    +this.titre+"','"+this.dateParution+"',"
                    +this.nbExemplaire+",'"+this.auteur+"','"+this.domaine+"')"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Supprimer(int isbn){
        try {
            Statement stm = ConnexionBD.seConnecter();
            stm.executeUpdate("delete from livre where isbn ="+isbn);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Modifier(int isbn, String titre, String dateParution,int nbExemplaire, String auteur, String domaine){
        try{
            Statement stm = ConnexionBD.seConnecter();
            stm.executeUpdate("update livre set titre='"+titre+"', date_produ='"+dateParution+"', Nb_exemplaire="
            +nbExemplaire+", nom_auteur='"+auteur+"', domaine ='"+domaine+"' where isbn="+isbn);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public List<Livre> getAllLivre(){
        List<Livre> livres = new ArrayList<Livre>();
        try {
            Statement stm = ConnexionBD.seConnecter();
            ResultSet rs=stm.executeQuery("SELECT * FROM livre");
            Stocker((List<Livre>) livres, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livres;
    }
    public List<Livre> afficherparISBN(int isbn){
        List<Livre> livres = new ArrayList<Livre>();
        try {
            Statement stm = ConnexionBD.seConnecter();
            ResultSet rs=stm.executeQuery("SELECT * FROM livre where isbn ="+isbn);
            Stocker((List<Livre>) livres, rs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return livres;
    }
    public List<Livre> afficherparDomaine(String domaine){
        List<Livre> livres = new ArrayList<Livre>();
        try {
            Statement stm = ConnexionBD.seConnecter();
            ResultSet rs=stm.executeQuery("SELECT * FROM livre where domaine ='"+domaine+"'");
            Stocker((List<Livre>) livres, rs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return livres;
    }

    public List<Livre> afficherparAuteur(String auteur){
        List<Livre> livres = new ArrayList<Livre>();
        try {
            Statement stm = ConnexionBD.seConnecter();
            ResultSet rs=stm.executeQuery("SELECT * FROM livre where nom_auteur ='"+auteur+"'");
            Stocker((List<Livre>) livres, rs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return livres;
    }

    private void Stocker(List<Livre> livres, ResultSet rs) throws SQLException {
        while (rs.next()){
            int isbn1=rs.getInt(1);
            String titre1=rs.getString(2);
            String dateParution1=rs.getString(3);
            int nbExemplaire1=rs.getInt(4);
            String auteur1=rs.getString(5);
            String domaine1=rs.getString(6);
            livres.add(new Livre(isbn1,titre1,dateParution1,nbExemplaire1,auteur1,domaine1));
        }
    }


}
