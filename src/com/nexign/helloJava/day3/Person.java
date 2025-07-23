package com.nexign.helloJava.day3;

import java.time.LocalDate;
import java.util.Random;

public class Person {
    private final String name;
    private int age;
    private long virtualMachineId;
    private Random random = new Random();
    private static int count;

    public Person(String name, LocalDate date) {
        this.name = name;
        this.age = LocalDate.now().getYear() - date.getYear();
        this.virtualMachineId = random.nextInt(100, 200);
    }

//    public Person(int date, String name) {
//        this.name = name;
//        this.date = date;
//        System.out.println("Hello there");
//    }

    //ALT + INSERT - generator


    public Person(String name) {
        this(name, LocalDate.of(2005,8,11));
        prepare();
    }

    public Person() {
        this("User01");
    }


    //переменной длинны
    public void talk(String... names) {
        //iter
        for (String s : names) {
            System.out.println("person " + s + " talking");
        }
    }

    public static void prepare() {
        count++;
    }

    public void talk(Person p) {
        System.out.println("person " + this.name + " talk " + " with " + p.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", virtualMachineId=" + virtualMachineId +
                '}';
    }
}
