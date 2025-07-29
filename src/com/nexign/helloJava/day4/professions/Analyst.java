package com.nexign.helloJava.day4.professions;

public class Analyst extends Employee {
    private String system;
    public Analyst(String name, int age, String department, String system) {
        super(name, age, department);
        this.system = system;
    }

    @Override
    public void work() {
        System.out.println("Описать " + system);
    }
}
