package at.fhtw.swen3.utils;

public class Pair<T1, T2> {
    private final T1 t1;
    private final T2 t2;

    public Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public Pair(Pair<T1, T2> pair) {
        this.t1 = pair.t1;
        this.t2 = pair.t2;
    }

    public T1 getFirst() {
        return t1;
    }

    public T2 getSecond() {
        return t2;
    }
}
