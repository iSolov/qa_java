package com.example;

import java.util.List;

/**
 * Описание котов. Коты всегда из семейства кошачьих.
 */
public class Cat extends Feline {

    public Cat() {
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return eatMeat();
    }

}
