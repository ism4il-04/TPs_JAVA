package TP6t.DAO;

import TP6t.Model.Jet;

import java.util.List;

public interface IDAO <T,U> {
    public void ajouterJet(T jet);
    public void supprimerJet(U CodeJet);
    public void modifierJet(T jet);
    List<Jet> getAll();
    Jet findById(U Code);

}
