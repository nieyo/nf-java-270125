package org.example.module2_object_orientation.c03_inheritance;

import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfDoors;

    @Override
    public void printInformation(){
        System.out.printf("This Car is manufactured by %s in %s. The name of the model is %s. ", manufacturer, yearOfManufacture, model);
        System.out.printf("It has %d doors.\n", numberOfDoors);
    }

    public Car() {
        super();
    }

    public Car(String manufacturer, String model, String yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                '}';
    }
}
