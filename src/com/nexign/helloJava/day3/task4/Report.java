package com.nexign.helloJava.day3.task4;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-30s | %10s%n", "Сотрудник", "Зарплата");
        System.out.println("---------------------------------------------");
        for (Employee employee : employees) {
            System.out.printf("%-30s | %10.2f%n", employee.getFullName(), employee.getSalary());
        }
    }
}
