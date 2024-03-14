import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Cat", 6, 7.0, 4);
        Animal dog = new Animal("Dog", 7, 10.0, 4);
        Animal fish = new Animal("Fish", 1, 0.01, 0);
        Animal bird = new Animal("Bird", 2, 0.2, 2);
        Animal guineaPig = new Animal("Guinea Pig", 5, 1.0, 4);
        Animal horse = new Animal("Horse", 22, 420.0, 4);
        Animal gorilla = new Animal("Gorilla", 38, 207.0, 2);
        Animal mouse = new Animal("Mouse", 1, 0.02, 4);
        ArrayList<Animal> animalList = new ArrayList<>(
                Arrays.asList(cat, dog, fish, bird, guineaPig, horse, gorilla, mouse));

        List<Animal> sortedList = Animal.sortByTwoLegs(animalList);
        for(Animal animal : sortedList){
            System.out.println(animal);
        }
    }
}