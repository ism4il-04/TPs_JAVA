package TP7.EX5;

import java.util.*;

public class GestionExamen {
    private ArrayList<Examen> exams = new ArrayList<Examen>();

    public void AjouterExam(Examen exam) {
        exams.add(exam);
    }

    public void SupprimerExam(Examen exam) {
        exams.remove(exam);
    }

    public void AfficherExamens(ArrayList<Examen> exams) {
        for(Examen exam : exams) {
            exam.afficher();
        }
    }
}
