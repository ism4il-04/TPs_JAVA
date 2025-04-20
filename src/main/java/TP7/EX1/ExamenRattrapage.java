package TP7.EX1;

public class ExamenRattrapage extends Examen {
    private String forme;

    public ExamenRattrapage(int numEnregistrement, float note, String profRespo, String matiere, String forme) throws NoteInvalide {
        super(numEnregistrement, note, profRespo, matiere);
        this.forme = forme;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    @Override
    public void afficher() {
        System.out.println("Examen de rattrapage numero: " + numEnregistrement+" note= "+note+" professeur responsable: "+ profRespo+" matiere= "+matiere +" forme= "+forme);
    }
}
