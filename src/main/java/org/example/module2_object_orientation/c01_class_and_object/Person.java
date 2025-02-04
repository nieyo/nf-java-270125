package org.example.module2_object_orientation.c01_class_and_object;

class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce (){
        String introduceMessage = String.format("Hallo, ich heiße %s und bin %d Jahre alt.", name, age);
        System.out.println(introduceMessage);
    }
}
