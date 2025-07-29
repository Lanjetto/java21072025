package com.nexign.helloJava.day3;

import java.util.Scanner;

public class StringTask3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String text = scanner.nextLine().trim();

        System.out.println("Введите элемент замены: ");
        String phase = scanner.nextLine().trim();

        if (text.isEmpty() || phase.isEmpty()) {
            System.err.println("Ошибка: Текст или слово не могут быть пустыми.");
            scanner.close();
            return;
        }


        String result = replaceSecondOccurrence(text, phase);

        System.out.println("Результат: " + result);


        scanner.close();
}

    // Метод для замены каждого второго вхождения слова на 'OOP'
    private static String replaceSecondOccurrence(String text, String word) {

        String[] words = text.split("\\b");


        StringBuilder result = new StringBuilder();


        int wordCount = 0;


        for (String current : words) {
            // Проверяем, совпадает ли текущее слово с искомым (с учетом границ)
            if (current.equals(word)) {
                wordCount++; // Увеличиваем счетчик вхождений
                // Если это второе вхождение, заменяем на 'OOP'
                if (wordCount % 2 == 0) {
                    result.append("OOP");
                } else {
                    result.append(current); // Оставляем слово без изменений
                }
            } else {
                result.append(current); // Добавляем нетронутое слово или символ
            }
        }

        return result.toString();
    }
}
