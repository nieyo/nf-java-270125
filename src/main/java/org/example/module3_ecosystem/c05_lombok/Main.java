package org.example.module3_ecosystem.c05_lombok;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = Student.builder()
                .id("1")
                .name("Max")
                .grade(2.0f)
                .address("address")
                .build();

        Student s2 = Student.builder()
                .id("2")
                .name("Maxi")
                .grade(1.8f)
                .address("address")
                .build();

        Teacher t1 = Teacher.builder()
                .id("1")
                .name("Alice")
                .subject("maths")
                .build();

        Course c1 = Course.builder()
                .students(new ArrayList<>(Arrays.asList(s1, s2)))
                .teacher(t1)
                .id("1")
                .name("awesome course")
                .build();

        System.out.println(c1);
    }
}
