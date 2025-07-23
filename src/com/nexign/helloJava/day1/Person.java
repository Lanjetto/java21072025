package com.nexign.helloJava.day1;

import java.util.Objects;

public class Person {
    private String name;
    private int age = 1;
    private double salary;

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        age = a;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    static int count = 0;

    public Person() {
        count = count + 1;
    }

    public void print() {
        int age;


        age = 4;
        System.out.println(age);
    }

    public void move(long l) {
        System.out.println("Moving with speed "  + l);

    }

    public String talk(String text) {
        return name + " says " + text;
    }

    public double calculateSalary(double modifier) {
        return modifier - salary;
    }

    //ALT + INSERT


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(salary, person.salary) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

}
