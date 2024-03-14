package csv.entity;

import csv.annotations.CSVEntity;
import csv.annotations.CSVField;

@CSVEntity
public class Car {
    @CSVField
    private String brand;
    @CSVField
    private String colour;
    @CSVField
    private Integer numDoors;
    @CSVField
    private Integer price;

    public Car(String brand, String colour, Integer numDoors, Integer price) {
        this.brand = brand;
        this.colour = colour;
        this.numDoors = numDoors;
        this.price = price;
    }
}
