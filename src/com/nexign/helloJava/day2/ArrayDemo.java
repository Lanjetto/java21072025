package com.nexign.helloJava.day2;

import com.nexign.helloJava.day1.Person;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = arr1;
        arr1[0] = 1;
        System.out.println(arr2[0]);

//        int[] clone = arr1.clone();
        int[] copy = Arrays.copyOf(arr1, arr1.length * 2);

        copy[4] = 3;

//        arr2[4] = 3;
//        arr2[0] = 2;
        boolean arrEq = Arrays.equals(arr1, arr2);
        System.out.println(arrEq);
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(arr2));
    }
}
