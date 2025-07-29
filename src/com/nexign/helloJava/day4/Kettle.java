package com.nexign.helloJava.day4;


import java.math.BigDecimal;
import java.util.Objects;




public class Kettle {
    private String brand;
    private double vol;
    private BigDecimal price;

    public Kettle(String brand, double vol, double price) {
        this.brand = brand;
        this.vol = vol;
        this.price = BigDecimal.valueOf(price);
    }

    public String getBrand() {
        return brand;
    }

    public double getVol() {
        return vol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void boil() {
        System.out.println("brrrrr");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kettle kettle = (Kettle) o;
        return Double.compare(vol, kettle.vol) == 0 && Objects.equals(brand, kettle.brand) && Objects.equals(price, kettle.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, vol, price);
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "brand='" + brand + '\'' +
                ", vol=" + vol +
                ", price=" + price +
                '}';
    }
}
