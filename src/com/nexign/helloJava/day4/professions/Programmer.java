package com.nexign.helloJava.day4.professions;

public class Programmer extends Employee{
    private String lang;
    public Programmer(String name, int age, String department, String lang) {
        super(name, age, department);
        this.lang = lang;
    }

    @Override
    public void work() {
        System.out.println("write code on " + lang + " lang");
    }
}
