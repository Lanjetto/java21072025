package com.nexign.helloJava.day6;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2,4,4));

        Set<Integer> set = new HashSet<>(Set.of(1,2,3,4,5,6,7,8));
        System.out.println(set);


        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        //не добавится
        hashSet.add("Five");
        System.out.println(hashSet);

        //порядок определён порядком записи
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Бета");
        linkedHashSet.add("Aльфa");
        linkedHashSet.add("Этa");
        linkedHashSet.add("Гaммa");
        linkedHashSet.add("Эпсилон");
        linkedHashSet.add("Oмeгa");
        //не добавится
        linkedHashSet.add("Oмeгa");
        System.out.println(linkedHashSet);


        SortedSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(11);
        System.out.println(treeSet);

    }
}
