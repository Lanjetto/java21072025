package com.nexign.helloJava.day6;

import com.nexign.helloJava.day3.Person;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Person> hm = new HashMap<>();
        hm.put("первый", new Person("Alex"));
        hm.put("второй", new Person("Миша"));
        hm.put("третий", new Person("Петя"));

        Set<String> strings = hm.keySet();
        for (String string : strings) {
            System.out.println("Ключ ->" + string );
            System.out.println("Значение ->" + hm.get(string) );
        }
        Collection<Person> values = hm.values();
        for (Person value : values) {
            System.out.println(value);
        }

        Map<String, Person> stringPersonMap = Map.of("1", new Person());
        Person person = hm.get("третий");
        person.talk(hm.get("второй"));


    }
}
