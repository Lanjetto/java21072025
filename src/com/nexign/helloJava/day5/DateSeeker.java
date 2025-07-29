package com.nexign.helloJava.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class DateSeeker {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("dir");
        findFilesFromFolders(path);
    }

    public static void findFilesFromFolders(Path path) throws IOException {
        try (Stream<Path> walk = Files.walk(path)) {
            walk.filter(x -> !Files.isDirectory(x))
                    .forEach(x -> {
                        try {
                            readFile(x);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }
    }

    public static void readFile(Path path) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            Pattern p = Pattern.compile("\\b(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[0-2])\\.(\\d{2}|\\d{4})\\b");
            Matcher m;
            while ((line = br.readLine()) != null) {
                m = p.matcher(line);
                while (m.find()) {
                    System.out.println("date:" +  m.group());
                }
            }

        }
    }


}
