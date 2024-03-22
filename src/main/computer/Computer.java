package computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public class Computer {
    Optional<CPU> cpu;
    Optional<Ram> ram;
    Optional<SSD> ssd;

    public Computer(){
        cpu = Optional.empty();
        ram = Optional.empty();
        ssd = Optional.empty();
    }

    public void print() {
        System.out.println("CPU:");
        this.cpu.ifPresentOrElse(
                CPU::print,
                () -> System.out.println("No CPU"));

        System.out.println("\nRAM:");
        this.ram.ifPresentOrElse(
                Ram::print,
                () -> System.out.println("No RAM"));

        System.out.println("\nSSD:");
        this.ssd.ifPresentOrElse(
                SSD::print,
                () -> System.out.println("No SSD"));
    }
}
