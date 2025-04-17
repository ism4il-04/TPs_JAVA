package TP7.EX5;

public class ExamenFinal extends Examen implements Comparable<ExamenFinal> {
    private int annee;
    private String heure;
    public ExamenFinal(int numEnregistrement, float note, String profRespo, String matiere, String heure) throws NoteInvalide {
        super(numEnregistrement, note, profRespo, matiere);
        this.heure = heure;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }

    @Override
    public void afficher() {
        System.out.println("Examen de rattrapage numero: " + numEnregistrement+"note= "+note+"professeur responsable"+ profRespo+"matiere= "+matiere +"annee= "+annee+"heure= "+heure);
    }

    @Override
    public int compareTo(ExamenFinal exam) {
        return Integer.compare(this.getAnnee(), exam.getAnnee());
    }
}
