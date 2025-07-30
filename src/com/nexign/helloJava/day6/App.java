package com.nexign.helloJava.day6;

import com.nexign.helloJava.day3.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Pair pair = new Pair("String1", "String2");

        ArrayList arrList = new ArrayList();

        arrList.add(1, "s");
        System.out.println((String) arrList.get(1));



        Integer[] arr = {1,2,3};

//        System.out.println(Pair.isIn(arr, 3));

        GenericPair<Integer, String> genericPair = new GenericPair<>(1, "2");
        GenericPair<String, String> genericPair1 = new GenericPair<>("1", "2");


        String[] arr1 = {"one", "two", "three"};

        List<Integer> strings = new ArrayList<>(Arrays.asList(1,2,3));
        strings.set(0,2);
        strings.add(4);







        System.out.println(strings);


        arr1[0] = "1";
        String[] arr2 = Arrays.copyOf(arr1, arr.length * 2);
        arr2[3] = "four";
        System.out.println(Arrays.toString(arr2));


        List<Integer> integers = List.of(1, 2, 3);
        System.out.println(integers.getFirst());
//        integers.add(2);
//        integers.set(0, 2);

        System.out.println(integers);




        LinkedList<Integer> integers1 = new LinkedList<>();
        integers1.addFirst(2);
        integers1.offerFirst(2);


        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,6));
        ArrayList<Integer> list1 = new ArrayList<>(List.of(2,4,4));
//        list.set(0,2);
//        list.addAll(integers);
        boolean contains = list.contains(1);
//        list.removeAll(list1);
        list.removeIf(x -> x%2==0);


        for (int i = 0; i < list1.size(); i++) {
             list1.set(i, 0);

        }




        System.out.println(list1);
    }
}
