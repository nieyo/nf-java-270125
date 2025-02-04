package org.example.module2_object_orientation.c01_class_and_object;

public class Main_Challenge01 {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Isetta", "red", 1955);
        car1.startEngine();
        car1.increaseSpeed(24);
        car1.increaseSpeed(16);
        car1.stopEngine();

        Person person1 = new Person("Jonas", 29, 'm');
        Person person2 = new Person("Steve", 34, 'm');
        Person person3 = new Person("Laura", 24, 'w');
        person1.introduce();
        person2.introduce();
        person3.introduce();




    }
}