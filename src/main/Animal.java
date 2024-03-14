import lombok.Data;
import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

//@Getter
//@ToString
@Data
@AllArgsConstructor
public class Animal {
    private String name;
    private Integer age;
    private Double weight;
    private Integer numLegs;

    public static List<Animal> sortByTwoLegs(List<Animal> animals){
        return animals.stream()
                .filter(animal -> animal.getNumLegs().equals(2))
                .collect(Collectors.toList());
    }

    public static List<Animal> sortByOlderThanTen(List<Animal> animals){
        return animals.stream()
                .filter(animal -> animal.getAge() > 10)
                .collect(Collectors.toList());
    }

    public static List<Animal> sortByAgeBetween5and8(List<Animal> animals){
        return animals.stream()
                .filter(animal -> animal.getAge() > 5)
                .filter(animal -> animal.getAge() < 8)
                .collect(Collectors.toList());
    }

    public static List<Animal> sortByYoungerThan20AndHeavierThan30(List<Animal> animals){
        return animals.stream()
                .filter(animal -> animal.getWeight() > 30)
                .filter(animal -> animal.getAge() < 20)
                .collect(Collectors.toList());
    }

    public static List<Animal> sortBy4LegsAndUnevenAge(List<Animal> animals){
        return animals.stream()
                .filter(animal -> animal.getNumLegs().equals(2))
                .filter(animal -> animal.getAge() % 2 == 1)
                .collect(Collectors.toList());
    }
}
