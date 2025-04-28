package TP8.EX4;

public class MainTest {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.addAdherent(new Adherent("Lyamani","Ismail", Statut.ETUDIANT));
        bibliotheque.addAdherent(new Adherent("El Bouhdidi", "Jaber", Statut.ENSEIGNANT));
        bibliotheque.addDocument(new Livre("Boite à merveille", "Sefrioui"));
        bibliotheque.addDocument(new Livre("Antigone", "Hugo"));
        bibliotheque.addDocument(new Revue("Revue 1", 5));
        bibliotheque.addDocument(new Revue("Revue 2", 10));
        bibliotheque.addDocument(new Dictionnaire("Larousse", "Ismail","Action"));
        bibliotheque.addDocument(new Dictionnaire("micro", "Jaber","Comedie"));
        bibliotheque.addDocument(new BandeDessinee("Marvel", "Karim","Ichiro"));
        bibliotheque.addDocument(new BandeDessinee("Dc", "Samira","Boishi"));
        bibliotheque.addMaterial(new OrdinateurPortable(true,"Ubuntu",Os.LINUX));
        bibliotheque.addMaterial(new OrdinateurPortable(false,"Microsoft",Os.WINDOWS));
    }
}
