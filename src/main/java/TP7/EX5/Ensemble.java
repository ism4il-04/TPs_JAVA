package TP7.EX5;

import java.util.Arrays;

public class Ensemble<T> implements Comparable<Ensemble<T>>{

    private T[] array;
    private int nombreElements;
    private int taille;

    public Ensemble(int N){
        this.array=(T[])new Comparable[N];
        this.taille =N;
    }
    public boolean ajouter(T e) throws CapaciteDepasseeException{
        for (int i = 0; i < this.taille; i++) {
            if (array[i] != null && array[i].equals(e)) {
                System.out.println("Déjà existant !");
                return false;
            }
        }
        for (int i = 0; i < this.taille; i++) {
            if (array[i] == null) {
                array[i] = e;
                nombreElements++;
                Arrays.sort(array,0, nombreElements);
                return true;
            }
        }

        throw new CapaciteDepasseeException("Tableau plein : impossible d'ajouter " + e);
    }
    public boolean retirer(T e)  {
        for (int i = 0; i < this.taille; i++) {
            if (array[i] != null && array[i].equals(e)) {
                for(int j = i+1; j<this.nombreElements; j++){
                    array[j] = array[j+1];
                }
                array[this.nombreElements -1] = null;
                nombreElements--;
                return true;
            }
        }
        System.out.println("Erreur retirer !");
        return false;
    }
    public void union(Ensemble<T> e) {
        for (int i = 0; i < e.taille; i++) {
            if (e.array[i] != null) {
                try {
                    this.ajouter(e.array[i]);
                } catch (CapaciteDepasseeException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public T[] getArray() {
        return array;
    }

    public void intersection(Ensemble<T> e) {
        for (int i = 0; i < this.taille; i++) {
            if (this.array[i] == null) {
                continue;
            }
            boolean exit = false;
            for (int j = 0; j < e.taille; j++) {
                if (e.array[j] != null && this.array[i].equals(e.array[j])) {
                    exit = true;
                    break; // pas la peine de continuer
                }
            }
            if (!exit) {
                this.retirer(this.array[i]);
            }
        }
    }

    public Ensemble<T> scinder(){
        int taille=(int)this.nombreElements /2;
        int newsize=this.nombreElements -taille;
        T [] resu;int j=0;
        resu=(T[])new Comparable[this.taille];
        for (int i = taille; i < this.nombreElements; i++) {
            resu[j++]=this.array[i];
        }
        this.array=resu;
        this.nombreElements =newsize;
        this.taille =resu.length;
        return this;
    }

    @Override
    public int compareTo(Ensemble<T> autre){
        return Integer.compare(this.nombreElements, autre.nombreElements);
    }
}
