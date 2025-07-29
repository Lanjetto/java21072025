package com.nexign.helloJava.day4;

public class Pod extends Kettle {
    private double temperature;

    public Pod(String brand, double vol, double price, double temperature) {
        super(brand, vol, price);
        this.temperature = temperature;
    }

    public Pod(String brand, double vol, double price) {
        super(brand, vol, price);
    }


    @Override
    public void boil() {
        if (temperature == 100) {
            super.boil();
        }
        System.out.println("Поддерживаю температуру на уровне " + temperature);
    }


    public void boil(double temperature) {
        this.temperature = temperature;
        boil();
    }
}
