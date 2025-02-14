package org.example.module3_ecosystem.c05_lombok;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // STUDENTS
        Student s1 = new Student("1", "Max", "address 1", 3.4f);
        Student s2 = new Student("2", "Maxi", "address 2", 2.8f);

        Student s3 = Student.builder()
                .id("3")
                .name("Maxim")
                .grade(2.0f)
                .address("address 3")
                .build();

        Student s4 = Student.builder()
                .id("4")
                .name("Maxima")
                .grade(1.8f)
                .address("address 4")
                .build();

        // TEACHER
        Teacher t1 = new Teacher("1", "Alice", "english");
        Teacher t2 = Teacher.builder()
                .id("2")
                .name("Bob")
                .subject("maths")
                .build();
        Teacher t3 = t2.withId("3").withName("Carol");

        // COURSES
        Course c1 = new Course("1", "course 1", t1, Arrays.asList(s1, s2, s3, s4));
        Course c2 = Course.builder()
                .students(new ArrayList<>(Arrays.asList(s1, s2)))
                .teacher(t2)
                .id("2")
                .name("course 2")
                .build();
        Course c3 = Course.builder()
                .students(new ArrayList<>(Arrays.asList(s3, s4)))
                .teacher(t3)
                .id("3")
                .name("course 3")
                .build();

        // OUTPUT
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
