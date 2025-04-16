package TP5.EX1;

public class Doyen extends Personnel{
    // Variable statique pour conserver l'instance unique
    private float primesDeplacement;
    private static Doyen instance = null;

    // Constructeur privé pour empêcher l'instanciation directe
    private Doyen(String nom, String prenom, float salaire, float primesDeplacement) {
        super(nom,prenom,salaire);
        System.out.println("Instance de Doyen creé.");
    }

    // Méthode statique pour accéder à l'instance unique
    public static Doyen getInstance(String nom, String prenom, float salaire, float primesDeplacement) {
        if (instance == null) {
            instance = new Doyen(nom,prenom,salaire,primesDeplacement);
        } else {
            System.out.println("Erreur : Une tentative d'instanciation d'un singleton a été détectée.");
        }
        return instance;
    }

    @Override
    public float CalculSalaire() {
        return salaire+primesDeplacement;
    }
    @Override
    public String toString() {
        return "Doyen{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + CalculSalaire() +
                '}';
    }
}
