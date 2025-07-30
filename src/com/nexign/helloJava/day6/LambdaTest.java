package com.nexign.helloJava.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(1,2,3,4));

        Integer sum = integers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println(sum);

        integers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        });

        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        });
    }
}
