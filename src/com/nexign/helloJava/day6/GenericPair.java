package com.nexign.helloJava.day6;

public class GenericPair<K, T> {
    private K a;
    private T b;

    public GenericPair(K a, T b) {
        this.a = a;
        this.b = b;
    }

    public K getA() {
        return a;
    }

    public void setA(K a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }
}
