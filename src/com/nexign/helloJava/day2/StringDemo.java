package com.nexign.helloJava.day2;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Alex";

        String name0 = String.valueOf(345);
        int i = Integer.parseInt("345");

        String name1 = new String("one two three");
        String name2 = new String("AsdfasD");

        byte[] bytes = name1.getBytes();
        char c = name1.charAt(0);

        System.out.println(name1.equalsIgnoreCase(name2));


        String[] s = name1.split(" ");
        String join = String.join(", ", s);
        System.out.println(join);
        System.out.println(Arrays.toString(s));

        char one = (char) bytes[0];
        System.out.println(one);

        StringBuilder sb = new StringBuilder();
        //fori - сниппет для цикла
        for (int j = 0; j < 5; j++) {
            sb.append(j);
        }


        String string = sb.toString();
        System.out.println(string);
    }
}
