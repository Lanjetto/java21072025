package com.nexign.helloJava.day2;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Трёхзначные числа Армстронга (через строки):");

        for (int number = 100; number <= 999; number++) {
            String numStr = Integer.toString(number);
            int sum = 0;

            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                sum += (int) Math.pow(digit, 3);
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
