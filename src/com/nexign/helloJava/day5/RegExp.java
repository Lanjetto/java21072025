package com.nexign.helloJava.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//поиск в строке email по регулярному выражению
public class RegExp {
    public static void main(String[] args) {
        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,3})";
        String s = "адреса эл.почты:ivanov@gmail.com, sidorov@bsu.by!, so@mail.ruru";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("e-mail: " + matcher.group());
        }

    }
}
