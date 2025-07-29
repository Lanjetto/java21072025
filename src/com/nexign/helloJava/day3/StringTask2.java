package com.nexign.helloJava.day3;

import java.util.Scanner;
import java.util.regex.Pattern;

// Определяем корректноть СНИЛСа - проверить формат ХХХ-ХХХ-ХХХ-YY 11 цифр, 9 код, 2 контрольные

public class StringTask2 {
    public static void main (String[] args) {
        // Объявляем сканер
        Scanner scanner = new Scanner(System.in);

        // 2. Запрашиваем ввод строки
        System.out.print("Введите СНИЛС (формат XXX-XXX-XXX YY): ");
        String input = scanner.nextLine().trim(); // Читаем строку и удаляем пробелы по краям

        // 3. Проверяем корректность формата СНИЛС
        boolean isValid = isValidSnils(input);

        // 4. Выводим результат
        System.out.println("СНИЛС \"" + input + "\" " +
                (isValid ? "корректен" : "некорректен"));

        // 5. Закрываем Scanner
        scanner.close();

    }

    private static boolean isValidSnils(String input) {
        // 6. Проверяем, что строка не null и не пустая
        if (input == null || input.isEmpty()) {
            return false;
        }

        // 7. Регулярное выражение для формата XXX-XXX-XXX YY и представляем в виде регулярного выражения ^\d{3}-\d{3}-\d{3}\s\d{2}$
        String snilsPattern = "^\\d{3}-\\d{3}-\\d{3}\\s\\d{2}$";

        // 8. Проверяем соответствие строки регулярному выражению
        return Pattern.matches(snilsPattern, input);
    }
}
