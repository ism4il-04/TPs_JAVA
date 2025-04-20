package TP7.EX1;

import java.util.*;

public class GestionExamen {
    private ArrayList<Examen> exams = new ArrayList<Examen>();
    public void AjouterExam(Examen exam) {
        exams.add(exam);
    }
    public void SupprimerExam(Examen exam) {
        exams.remove(exam);
    }
    public void AfficherExamens() {
        for(Examen exam : exams) {
            exam.afficher();
        }
    }
    public void TrierExamensAnnee() {
        ArrayList<ExamenFinal> examsFinal = new ArrayList<>();
        for(Examen exam : exams) {
            if (exam instanceof ExamenFinal) {
                examsFinal.add((ExamenFinal) exam);
            }
        }
        Collections.sort(examsFinal);
        for(ExamenFinal examf : examsFinal) {
            examf.afficher();
        }
    }
}
