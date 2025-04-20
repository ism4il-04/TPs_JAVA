package TP7.EX4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Pair<Integer, Integer> pair1 = new Pair<>(3, 7);
        Pair<String, String> pair2 = new Pair<>("Apple", "Banana");
        System.out.println("Max de (3,7) : " + OperationPair.getMax(pair1));
        System.out.println("Max de (Apple,Banana) : " + OperationPair.getMax(pair2));
        List<Pair<String, String>> listString = new ArrayList<>();
        listString.add(new Pair<>("B", "X"));
        listString.add(new Pair<>("A", "Z"));
        listString.add(new Pair<>("A", "M"));
        listString.add(new Pair<>("C", "A"));

        System.out.println("\nAvant TriListePair :");
        for (Pair<String, String> p : listString) {
            System.out.println("(" + p.getFst() + "," + p.getSnd() + ")");
        }
        OperationPair.TriListePair(listString);
        System.out.println("\nAprès TriListePair :");
        for (Pair<String, String> p : listString) {
            System.out.println("(" + p.getFst() + "," + p.getSnd() + ")");
        }
        Pair<Double, Integer> pair3 = new Pair<>(5.5, 4);
        System.out.println("\nSomme de (5.5,4) : " + OperationPair.Somme(pair3));
        List<Pair<Integer, Integer>> listeIntInt = new ArrayList<>();
        listeIntInt.add(new Pair<>(1, 2));
        listeIntInt.add(new Pair<>(3, 4));
        listeIntInt.add(new Pair<>(5, 6));

        double[] tableau1 = OperationPair.collectionToTableauV1(listeIntInt);
        System.out.println("\nRésultat collectionToTableauV1 : " + Arrays.toString(tableau1));
        List<Pair<Integer, Double>> listeIntDouble = new ArrayList<>();
        listeIntDouble.add(new Pair<>(2, 3.5));
        listeIntDouble.add(new Pair<>(1, 4.5));
        listeIntDouble.add(new Pair<>(0, 5.5));

        double[] tableau2 = OperationPair.collectionToTableauV2(listeIntDouble);
        System.out.println("\nRésultat collectionToTableauV2 : " + Arrays.toString(tableau2));
    }
}
