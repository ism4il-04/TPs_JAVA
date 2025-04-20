package TP7.EX4;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperationPair {
    public static <U extends Comparable<U>> U getMax(Pair<U, U> P){
        U First=P.getFst();
        U Second=P.getSnd();
        if(First.compareTo(Second)>0){
            return First;
        }
        return Second;
    }
    public static <U extends Comparable<U>,V extends Comparable<V>> void TriListePair(List<Pair<U,V>> P){
        Collections.sort(P,new Comparator<Pair<U,V>>() {

            @Override
            public int compare(Pair<U, V> o1, Pair<U, V> o2) {
                int cmpFst=o1.getFst().compareTo(o2.getFst());
                if (cmpFst!=0){
                    return cmpFst;
                }
                else{
                    return o1.getSnd().compareTo(o2.getSnd());
                }
            }
        });
    }
    public static <U extends Number,V extends Number> Double Somme(Pair<U, V> P){
        return (P.getFst().doubleValue()+P.getSnd().doubleValue());
    }
    public static <U extends Number> double[] collectionToTableauV1(Collection<Pair<U, U>> liste){
        double[] tableau=new double[liste.size()];
        int i = 0;
        for (Pair<U, U> p : liste) {
            tableau[i] = Somme(p);
            i++;
        }
        return tableau;
    }
    public static <U extends Number,V extends Number> double[] collectionToTableauV2(Collection<Pair<U, V>> liste){
        double[] tableau=new double[liste.size()];
        int i = 0;
        for (Pair<U, V> p : liste) {
            tableau[i] = Somme(p);
            i++;
        }
        return tableau;
    }
}
