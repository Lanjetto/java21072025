package com.nexign.helloJava.day3;

import java.time.LocalDate;
import java.util.Arrays;

public class ConstructorDemo {
    public static void main(String[] args) {
        Person person = new Person("Alex", LocalDate.of(1990,5,23));
        Person person2 = new Person("Vasya");
        System.out.println(person);
        System.out.println(person2);


        Person person1 = new Person();
        person1.talk("V",
                "A",
                "S",
                "s");
    }
}
