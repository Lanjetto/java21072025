package com.nexign.helloJava.day4;
//ctrl + alt + o

import com.nexign.helloJava.day4.professions.Analyst;
import com.nexign.helloJava.day4.professions.Employee;
import com.nexign.helloJava.day4.professions.Person;
import com.nexign.helloJava.day4.professions.Programmer;
import com.nexign.helloJava.day4.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Philps", 2.0, 1500.50);
        Pod pod = new Pod("Dexp", 5.0, 2500.0);
        Pod k1  = new Pod("Samsung", 3.5, 3000);
        k1.boil(50.0);
        Kettle[] arrKet = {
                pod,
                kettle,
                k1
        };

        for (Kettle kettle1 : arrKet) {
            kettle1.boil();
        }



        System.out.println(kettle.getBrand());
        System.out.println(kettle);
        kettle.boil();


        pod.boil(100.0);


        Object o = new Object();


//        Person alex = new Person("Alex", 23);
//        alex.name();

//        Cat al = new Cat("Al", 2);

        Car car = new Car(2);
        car.getEngine();


        Employee em1 = new Analyst("Alex", 20, "DIT", "HRM");
        Employee em2 = new Programmer("Alex", 20, "DIT","C#");

        em2.work();
        em1.work();

    }
}
