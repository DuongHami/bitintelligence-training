package computer;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
        Computer pc1 = new Computer();
        Computer pc2 = new Computer();

        CPU intel = new CPU("Intel", "i7",12);
        CPU amd = new CPU("AMD", "Ryzen 5", null);

        Ram corsair = new Ram("Corsair", 8);
        Ram hyperx = new Ram("HyperX", null);

        SSD samsung = new SSD("Samsung", 1024);
        SSD sandisk = new SSD(null, 2048);

        pc1.setCpu(Optional.of(intel));
        pc1.setRam(Optional.of(hyperx));
        pc1.setSsd(Optional.of(samsung));

        System.out.println("PC 1 start-------------------");
        pc1.print();
        System.out.println("PC 1 end---------------------");
        System.out.println();

        pc2.setCpu(Optional.of(amd));
        pc2.setRam(Optional.empty());
        pc2.setSsd(Optional.of(sandisk));

        System.out.println("PC 2 start-------------------");
        pc2.print();
        System.out.println("PC 2 end---------------------");


    }
}
