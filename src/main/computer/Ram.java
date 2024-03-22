package computer;

import lombok.AllArgsConstructor;

import java.util.Optional;

public class Ram {

    Optional<String> brand;
    Optional<Integer> capacity;

    public Ram(String brand, Integer capacity){
        this.brand = Optional.ofNullable(brand);
        this.capacity = Optional.ofNullable(capacity);
    }



    public void print() {
        this.brand.ifPresentOrElse(
                brand -> System.out.println("- " + brand),
                () -> System.out.println("- Unknown brand"));

        this.capacity.ifPresentOrElse(
                capacity -> System.out.println("- " + capacity + "GB"),
                () -> System.out.println("- Unknown capacity"));
    }
}
