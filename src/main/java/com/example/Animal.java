package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(AnimalKind animalKind) throws Exception {
        if (animalKind.equals(AnimalKind.Herbivore)) {
            return List.of("Трава", "Различные растения");
        } else if (animalKind.equals(AnimalKind.Predator)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}