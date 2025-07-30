package com.nexign.helloJava.day5;

import java.io.IOException;

public class DivideDemo {
    public double divide(int a, int b) throws DivideByZeroException {
        if (b == 0 ) {
            throw new DivideByZeroException("На 0 дельить нельзя");
        }
        return a / b;
    }
}
