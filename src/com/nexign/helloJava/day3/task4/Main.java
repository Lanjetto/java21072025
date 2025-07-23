package com.nexign.helloJava.day3.task4;

/**
 * Создать класс Employee, у которого есть переменные класса - fullname, salary.
 * Создать массив содержащий несколько объектов этого типа.
 * Создать класс Report  со статическим методом generateReport, в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматирование строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Alex", 200.0),
                new Employee("Stas", 120.2),
                new Employee("Igor", 220.5),
        };

        Report.generateReport(employees);
    }
}
