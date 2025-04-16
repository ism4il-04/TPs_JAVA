package TP6t.DAO;

import TP6t.Model.Jet;

import java.util.List;

public interface IDAOJet {

    public void ajouterJet(Jet jet);
    public void supprimerJet(int CodeJet);
    public void modifierJet(Jet jet);
    List<Jet> getAll();
    Jet findById(int Code);
}
