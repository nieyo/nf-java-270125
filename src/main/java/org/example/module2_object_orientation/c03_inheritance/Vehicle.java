package org.example.module2_object_orientation.c03_inheritance;

import java.util.Objects;

public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected String yearOfManufacture;

    public void printInformation(){
        System.out.print("---\n");
        System.out.printf("This Vehicle is manufactured by %s in %s. The name of the model is %s.\n", manufacturer, yearOfManufacture, model);
    }

    public Vehicle() {
    }

    public Vehicle(String manufacturer, String model, String yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model) && Objects.equals(yearOfManufacture, vehicle.yearOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearOfManufacture);
    }
}

