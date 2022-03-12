package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    public static final String FELINE_FAMILY = "Кошачьи";

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood(animalKind);
    }

    @Override
    public String getFamily() {
        return FELINE_FAMILY;
    }

    public int getKittens(int kittensCount) throws Exception  {
        if(kittensCount >= 0){
            return kittensCount;
        } else {
            throw new Exception("Неправильное количество котят.");
        }
    }

}
