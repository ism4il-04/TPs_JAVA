package TP7.EX1;

public class Main {
    public static void main(String[] args) {
        GestionExamen ge = new GestionExamen();

        // Déclaration des objets en dehors du try
        ExamenFinal ef1 = null, ef2 = null, ef3 = null;
        ExamenRattrapage er1 = null, er2 = null, er3 = null;

        // Création et ajout d'examens valides
        try {
            ef1 = new ExamenFinal(1, 15, "Mme Dupont", "Math", 2024, "08:00");
            ef2 = new ExamenFinal(2, 17, "M. Ali", "Physique", 2023, "10:00");
            ef3 = new ExamenFinal(3, 12, "M. Samir", "Informatique", 2025, "14:00");

            er1 = new ExamenRattrapage(4, 11, "Mme Salma", "Biologie", "écrit");
            er2 = new ExamenRattrapage(5, 13, "M. Karim", "Chimie", "oral");
            er3 = new ExamenRattrapage(6, 18, "Mme Yasmine", "Anglais", "oral");

            ge.AjouterExam(ef1);
            ge.AjouterExam(ef2);
            ge.AjouterExam(ef3);
            ge.AjouterExam(er1);
            ge.AjouterExam(er2);
            ge.AjouterExam(er3);
        } catch (NoteInvalide e) {
            System.out.println("Erreur lors de la création d'un examen : " + e.getMessage());
        }

        // Cas de note invalide
        try {
            ExamenRattrapage er4 = new ExamenRattrapage(7, -5, "M. Omar", "Chimie", "oral");
            ge.AjouterExam(er4);
        } catch (NoteInvalide e) {
            System.out.println("Erreur (note invalide) : " + e.getMessage());
        }

        // Affichage de tous les examens
        System.out.println("\n Tous les examens :");
        ge.AfficherExamens();

        // Suppression de l'examen n°4
        System.out.println("\n Suppression de l'examen n°4");
        ge.SupprimerExam(er1);

        // Affichage après suppression
        System.out.println("\n Examens après suppression :");
        ge.AfficherExamens();

        // Trier les examens finaux par année
        System.out.println("\n Examens finaux triés par année :");
        ge.TrierExamensAnnee();
    }
}
