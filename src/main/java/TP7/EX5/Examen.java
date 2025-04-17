package TP7.EX5;

public abstract class Examen  {
    protected int numEnregistrement;
    protected float note;
    protected String profRespo;
    protected String matiere;
    //getters et setters
    public float getNote() {return note;}
    public void setNote(float note) {this.note = note;}
    public int getNumEnregistrement() {return numEnregistrement;}
    public void setNumEnregistrement(int numEnregistrement) {this.numEnregistrement = numEnregistrement;}
    public String getProfRespo() {return profRespo;}
    public void setProfRespo(String profRespo) {this.profRespo = profRespo;}
    public String getMatiere() {return matiere;}
    public void setMatiere(String matiere) {this.matiere = matiere;}
    // constructeur
    public Examen(int numEnregistrement, float note, String profRespo, String matiere) throws NoteInvalide {
        if (note < 0 || note > 20) {
            throw new NoteInvalide();
        }
        this.numEnregistrement = numEnregistrement;
        this.note = note;
        this.profRespo = profRespo;
        this.matiere = matiere;
    }

    public void afficher() {};
}
