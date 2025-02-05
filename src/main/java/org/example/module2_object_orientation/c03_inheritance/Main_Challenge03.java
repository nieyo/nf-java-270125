package org.example.module2_object_orientation.c03_inheritance;

public class Main_Challenge03 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Piaggio", "Ape Calessino", "1956");
        Car c1 = new Car("BMW", "MINI Cooper Hatchback", "2024", 3);
        Motorcycle m1 = new Motorcycle("Harley-Davidson", "Road Glide", "2024", "Touring");

        v1.printInformation();
        c1.printInformation();
        System.out.println(m1.getType());
    }
}
