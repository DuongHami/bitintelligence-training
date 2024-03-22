package computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@AllArgsConstructor
@Getter
@Setter
public class CPU {
    Optional<String> brand;
    Optional<String> model;
    Optional<Integer> cores;

    public CPU(String brand, String model, Integer cores){
        this.brand = Optional.ofNullable(brand);
        this.model = Optional.ofNullable(model);
        this.cores = Optional.ofNullable(cores);
    }

    public void print() {
        this.brand.ifPresentOrElse(
                brand -> System.out.println("- " + brand),
                () -> System.out.println("- Unknown brand"));

        this.model.ifPresentOrElse(
                model -> System.out.println("- " + model),
                () -> System.out.println("- Unknown model"));

        this.cores.ifPresentOrElse(
                cores -> System.out.println("- " + cores),
                () -> System.out.println("- Unknown number of cores"));
    }
}
