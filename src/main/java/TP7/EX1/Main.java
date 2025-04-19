package TP7.EX1;

public class Main {
    public static void main(String[] args) {
        try {
            GestionExamen ge = new GestionExamen();

            ExamenFinal ef1 = new ExamenFinal(1, 15, "Mme Dupont", "Math", 2024, "08:00");
            ExamenFinal ef2 = new ExamenFinal(2, 17, "M. Ali", "Physique", 2023, "10:00");

            ExamenRattrapage er1 = new ExamenRattrapage(3, -12, "M. Omar", "Chimie", "oral");

            ge.AjouterExam(ef1);
            ge.AjouterExam(ef2);
            ge.AjouterExam(er1);

            System.out.println("Tous les examens :");
            ge.AfficherExamens();

            System.out.println("\nExamens finaux triés par année :");
            ge.TrierExamensAnnee();

        } catch (NoteInvalide e) {
            System.out.println(e.getMessage());
        }
    }
}
