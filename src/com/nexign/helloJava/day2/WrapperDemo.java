package com.nexign.helloJava.day2;

import java.math.BigDecimal;

public class WrapperDemo {
    public static void main(String[] args) {
        long i0 = 1200;
        Long i = 1200L;
        Long i1 = 1200L;
        BigDecimal b = BigDecimal.valueOf(2.0);
        BigDecimal b1 = new BigDecimal("1.1");
        BigDecimal minus = b.subtract(b1);
        System.out.println(minus);


        System.out.println(i0 + i + i1);

        System.out.println(i.equals(i1));

    }
}
