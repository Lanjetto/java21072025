package com.nexign.helloJava.day5;

public enum CupSize {
    S(0.25), M(0.5), L(0.7);
    private double volume;

    CupSize(double volume) {
        this.volume = volume;
    }
}
