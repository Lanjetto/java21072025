package com.nexign.helloJava.day3;


class Employee {
    private String name; // Имя сотрудника
    private double salary; // Зарплата

    // Конструктор
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Геттеры
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }
}

// класс для визуала
class Report {
    // Метод для генерации отчета
    public static void generateReport(Employee[] employees) {
        // Заголовок
        System.out.println("Отчет о зарплатах:");
        // Форматирование: выравнивание по правому краю, 2 знака после запятой
        for (Employee emp : employees) {
            // %15.2f: 15 символов, выравнивание вправо, 2 знака после запятой
            System.out.printf("Сотрудник: %-20s Зарплата: **%15.2f**%n",
                    emp.getName(), emp.getSalary());
        }
    }
}

//тело выполнения
public class StringTask4 {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employees = {
                new Employee("Иван Иванов", 23456.654),
                new Employee("Иван Петров", 34567.765),
                new Employee("Алексей Жуков", 56789.987)
        };

        // Генерируем отчет
        Report.generateReport(employees);
    }
}
