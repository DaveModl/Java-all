package com.java.object.generics;

/**
 * 泛型类
 * @param <T>
 */
public class PairT<T> {
    private T first;
    private T second;

    public PairT(){
        first = null;
        second = null;
    }

    public PairT(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
