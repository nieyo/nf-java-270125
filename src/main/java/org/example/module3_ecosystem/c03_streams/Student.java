package org.example.module3_ecosystem.c03_streams;

public class Student {
    private int id;
    private String name;
    private String postalCode;
    private int age;

    // Constructor
    public Student(int id, String name, String postalCode, int age) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", age=" + age +
                '}';
    }
}
