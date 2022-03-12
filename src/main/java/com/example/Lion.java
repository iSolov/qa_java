package com.example;

import java.util.List;

/**
 * Описание льва. Лев всегда из семейства кошачьих.
 */
public class Lion extends Feline {

    boolean hasMane;

    public Lion(SexKind sex) throws Exception {
        if (sex.equals(SexKind.Male)) {
            hasMane = true;
        } else if (sex.equals(SexKind.Female)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return getFood(animalKind);
    }
}