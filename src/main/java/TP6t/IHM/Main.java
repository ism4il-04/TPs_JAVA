package TP6t.IHM;

import TP6t.Model.Jet;
import TP6t.Service.IserviceJet;
import TP6t.Service.ServiceJet;

public class Main {
    public static void main(String[] args) {
        IserviceJet jet = new ServiceJet();
        Jet jet2 = new Jet(1,"F-16",10,10,10);
        jet.modifierJet(jet2);
    }
}
