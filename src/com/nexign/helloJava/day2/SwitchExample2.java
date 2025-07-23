package com.nexign.helloJava.day2;

public class SwitchExample2 {

    private static final int CONST = 13;

    public static int calculate(int month) {
        return month*CONST;
    }

    public static void main(String[] args) {
        int month = 2;
        switch (month) {
            case 1:
                System.out.println("January");
                month++;
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("It's winter");
            case 4:
                System.out.println("April");
                System.out.println(calculate(month));
                break;
            default:
                System.out.println("other month");
        }
    }

}
