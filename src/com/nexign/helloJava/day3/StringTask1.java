package com.nexign.helloJava.day3;
import java.util.Scanner;

public class StringTask1 {
    public static void main(String[] args) {
        // 1. Создаем объект Scanner для чтения с консоли
        Scanner scanner = new Scanner(System.in);

        // 2. Запрашиваем ввод строки у пользователя
        System.out.print("Введите строку для проверки на палиндром: ");
        String input = scanner.nextLine(); // Читаем целую строку

        // 3. Проверяем, является ли строка палиндромом
        boolean isPalindrome = isPalindrome(input);

        // 4. Выводим результат
        System.out.println("Строка \"" + input + "\" " +
                (isPalindrome ? "является палиндромом" : "не является палиндромом"));

        // 5. Закрываем Scanner
        scanner.close();
    }

    // Метод для проверки палиндрома (аналогичен предыдущей задаче)
    private static boolean isPalindrome(String input) {
        // Создаем StringBuilder для хранения только букв и цифр
        StringBuilder cleaned = new StringBuilder();

        // Преобразуем в нижний регистр и фильтруем только буквы и цифры
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }

        // Получаем очищенную строку
        String cleanedString = cleaned.toString();

        // Проверяем палиндром с помощью двух указателей
        int left = 0;
        int right = cleanedString.length() - 1;
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
