package com.nexign.helloJava.day3;

class Phone {
    private String number;
    private String model;
    private double weight;
    private static int phoneCount = 0;
    //dry - DONT REPEAT YOURSELF
    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        // Вызываем конструктор с двумя параметрами
        this(number, model);
        this.weight = weight;
        phoneCount++;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 155.0; // Значение по умолчанию
        phoneCount++;
    }

    public Phone() {
        this.number = "Unknown";
        this.model = "Unknown";
        this.weight = 155.0;
        phoneCount++;
    }

    // Метод receiveCall (один параметр)
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Перегруженный метод receiveCall (два параметра)
    public void receiveCall(String name, String callerNumber) {
        System.out.printf("Звонит %s с номера %s%n", name, callerNumber);
    }

    // Методы по одному 
    public String getNumber() {
        return number;
    }

    public String getModel(){
        return model;
    }

    public double getWeight(){
        return weight;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String num : numbers) {
            System.out.println("  " + num);
        }
    }

    public static int getPhoneCount() {
        return phoneCount;
    }
}
public class Day3Task1 {
    public static void main(String[] args) {
        // 1. Создаем три экземпляра класса Phone
        Phone phone1 = new Phone("+7-999-888-4545", "iPhone 12", 174.0);
        Phone phone2 = new Phone("+7-999-777-5454", "Samsung Galaxy S22");
        Phone phone3 = new Phone();

        // 2. Выводим значения переменных
        System.out.println("Телефон 1:");
        System.out.printf("  Номер: %s, Модель: %s, Вес: %.2f г%n",
                phone1.getNumber(), phone1.getModel(), phone1.getWeight());
        System.out.println("Телефон 2:");
        System.out.printf("  Номер: %s, Модель: %s, Вес: %.2f г%n",
                phone2.getNumber(), phone2.getModel(), phone2.getWeight());
        System.out.println("Телефон 3:");
        System.out.printf("  Номер: %s, Модель: %s, Вес: %.2f г%n",
                phone3.getNumber(), phone3.getModel(), phone3.getWeight());

        // 3. Вызываем метод receiveCall (один параметр)
        System.out.println("\nВызов receiveCall (один параметр):");
        phone1.receiveCall("Иван");
        phone2.receiveCall("Мария");
        phone3.receiveCall("Алексей");

        // 4. Вызываем перегруженный метод receiveCall (два параметра)
        System.out.println("\nВызов receiveCall (два параметра):");
        phone1.receiveCall("Иван", "+7-111-222-3333");
        phone2.receiveCall("Мария", "+7-444-555-6666");
        phone3.receiveCall("Алексей", "+7-777-888-9999");

        // 5. Вызываем getNumber
        System.out.println("\nНомера телефонов:");
        System.out.println("Телефон 1: " + phone1.getNumber());
        System.out.println("Телефон 2: " + phone2.getNumber());
        System.out.println("Телефон 3: " + phone3.getNumber());

        // 6. Вызываем sendMessage
        System.out.println("\nОтправка сообщений:");
        phone1.sendMessage("+7-111-222-3333", "+7-444-555-6666", "+7-777-888-9999");

        // 7. Выводим количество созданных телефонов
        System.out.println("\nКоличество созданных телефонов: " + Phone.getPhoneCount());
    }
}
