package TP7.EX4;

public class Pair<U,V> {
    private U Fst;
    private V Snd;
    public Pair(U Fst, V Snd) {
        this.Fst = Fst;
        this.Snd = Snd;
    }

    public U getFst() {
        return Fst;
    }

    public void setFst(U fst) {
        Fst = fst;
    }

    public V getSnd() {
        return Snd;
    }

    public void setSnd(V snd) {
        Snd = snd;
    }
}
