package com.nexign.helloJava.day5;

import java.time.LocalDate;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        String[] cities = {
                "Омск",
                "Екатеринбург",
                "СПБ",
                "МСК"
        };
        for (String city : cities) {
            System.out.println("Посылка идет в " + city);
        }

        for (City city : City.values()) {
            System.out.println("Посылка принята в городе с id" + city.getId());
        }

        City msk = City.MSK;
        String name = msk.name();
        City city = City.valueOf("msk");
    }
}
