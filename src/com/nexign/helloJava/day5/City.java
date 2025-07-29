package com.nexign.helloJava.day5;

public enum City {
    OMSK(1), MSK(2), EKAT(3), SPB(4);
    private long id;

    City(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
