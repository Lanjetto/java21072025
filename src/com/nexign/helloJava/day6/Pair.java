package com.nexign.helloJava.day6;

import java.util.List;

public class Pair {
    private String a;
    private String b;

    public Pair(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public static  <T, V> boolean isIn(List<T> arr, V obj) {
        boolean flag = false;
        for (T t : arr) {
            if (t.equals(obj)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
