package com.example;

import java.util.List;

/**
 * Описание льва. Лев всегда из семейства кошачьих.
 */
public class Lion {
    boolean hasMane;
    Feline feline;

    public Lion(SexKind sex, Feline feline) throws Exception {
        this.feline = feline;

        if (sex.equals(SexKind.Male)) {
            hasMane = true;
        } else if (sex.equals(SexKind.Female)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }

    public List<String> eatMeat() throws Exception {
        return feline.eatMeat();
    }

    public int getKittens(int kittensCount) throws Exception {
        return feline.getKittens(kittensCount);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }
}