package com.nexign.helloJava.day2;

public class Task7 {

    public static void main (String[] args){
        if (args.length == 0) {
            System.out.println("Не задано число через конфигуацию!");
            return;
        }

        try {

            int dayNumber = Integer.parseInt(args[0]);


            if (dayNumber < 1 || dayNumber > 7) {
                System.out.println("В неделе 7 дней!");
                return;
            }

            String dayName = switch (dayNumber) {
                case 1 -> "Понедельник";
                case 2 -> "Вторник";
                case 3 -> "Среда";
                case 4 -> "Четверг";
                case 5 -> "Пятница";
                case 6, 7 -> "Выходной";
                default -> "Неизвестный день";
            };


            System.out.println(dayName);

        } catch (NumberFormatException e) {

            System.err.println("Нужно ввести число для отображения дня!");
        }
    }
}
