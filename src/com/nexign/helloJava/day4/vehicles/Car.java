package com.nexign.helloJava.day4.vehicles;

import com.nexign.helloJava.day4.professions.Person;

public class Car implements Movable, Comparable<Car> {
    private Engine engine;

    public Car(int vol) {
        this.engine = new Engine(vol);
    }

    public Engine getEngine() {
        return engine;
    }

    public void drive() {
        System.out.println(" едет");
    }

    @Override
    public void move() {
        drive();
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    private class Engine {
        private int volume;

        public Engine(int volume) {
            this.volume = volume;
        }

        public int getVolume() {
            return volume;
        }
    }
}
