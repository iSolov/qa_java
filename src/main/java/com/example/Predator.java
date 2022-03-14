package com.example;

import java.util.List;

/**
 * Хищник.
 */
public interface Predator {

    AnimalKind animalKind = AnimalKind.Predator;

    List<String> eatMeat() throws Exception;

}
