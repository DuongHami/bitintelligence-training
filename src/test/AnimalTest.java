import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal cat = new Animal("Cat", 6, 7.0, 4);
    Animal dog = new Animal("Dog", 7, 10.0, 4);
    Animal fish = new Animal("Fish", 1, 0.01, 0);
    Animal bird = new Animal("Bird", 2, 0.2, 2);
    Animal guineaPig = new Animal("Guinea Pig", 5, 1.0, 4);
    Animal horse = new Animal("Horse", 19, 420.0, 4);
    Animal gorilla = new Animal("Gorilla", 38, 207.0, 2);
    Animal mouse = new Animal("Mouse", 1, 0.02, 4);
    ArrayList<Animal> animalList = new ArrayList<>(
            Arrays.asList(cat, dog, fish, bird, guineaPig, horse, gorilla, mouse));

    @Test
    void sortByTwoLegs() {
        List<Animal> filteredList = Animal.sortByTwoLegs(animalList);
        assertTrue(filteredList.contains(bird));
        assertTrue(filteredList.contains(gorilla));
    }

    @Test
    void sortByTwoLegsNegative() {
        List<Animal> filteredList = Animal.sortByTwoLegs(animalList);
        assertFalse(filteredList.contains(fish));
    }

    @Test
    void sortByOlderThanTen() {
        List<Animal> filteredList = Animal.sortByOlderThanTen(animalList);
        assertTrue(filteredList.contains(horse));
        assertTrue(filteredList.contains(gorilla));
    }

    @Test
    void sortByAgeBetween5and8() {
        List<Animal> filteredList = Animal.sortByAgeBetween5and8(animalList);
        assertTrue(filteredList.contains(dog));
        assertTrue(filteredList.contains(cat));
    }

    @Test
    void sortByYoungerThan20AndHeavierThan30() {
        List<Animal> filteredList = Animal.sortByYoungerThan20AndHeavierThan30(animalList);
        assertTrue(filteredList.contains(horse));
    }

    @Test
    void sortBy4LegsAndUnevenAge() {
        List<Animal> filteredList = Animal.sortBy4LegsAndUnevenAge(animalList);
        assertTrue(filteredList.contains(horse));
        assertTrue(filteredList.contains(dog));
        assertTrue(filteredList.contains(guineaPig));
        assertTrue(filteredList.contains(mouse));
    }
}