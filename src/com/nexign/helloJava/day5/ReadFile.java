package com.nexign.helloJava.day5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        try (FileReader fr = new FileReader("1.txt");
             BufferedReader br = new BufferedReader(fr);
             PrintWriter pw = new PrintWriter(System.out)) {

            String s = br.readLine();
            System.out.println("Строка " + s + "считана из файла");
            pw.println(s);
            System.out.println("Строка записана в файл");
        }


    }
}
