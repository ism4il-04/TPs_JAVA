package TP5.EX1;
import java.util.List;

public class Enseignant extends Personnel {
    // Attributs spécifiques à la classe Enseignant
    private String grade;
    private List<Etudiant> listeEtudiant;
    private int heuresSupplementaires;

    // Constructeur
    public Enseignant(String nom, String prenom, float salaireBase, String grade, List<Etudiant> listeEtudiant, int heuresSupplementaires) {
        super(nom, prenom, salaireBase); // Appel au constructeur de Personnel
        this.grade = grade;
        this.listeEtudiant = listeEtudiant;
        this.heuresSupplementaires = heuresSupplementaires;
    }

    public float CalculerSalaire() {
       return salaire + heuresSupplementaires*20;
    }
    @Override
    public String toString() {
        return "Enseignant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", grade='" + grade + '\'' +
                ", heuresSupplementaires=" + heuresSupplementaires +
                ", salaire=" + CalculerSalaire() +
                '}';
    }
}