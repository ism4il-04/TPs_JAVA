package TP6t.Service;

import TP6t.Model.Jet;

public interface IserviceJet {

    public void ajouteJet(Jet jet);
    public void supprimerJet(int CodeJet);
    public void modifierJet(Jet jet);

}
