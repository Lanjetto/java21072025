package com.nexign.helloJava.day4.professions;

public abstract class Employee extends Person{
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public abstract void work();
}
