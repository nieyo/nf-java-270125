package org.example.module3_ecosystem.c06_exceptions;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .id("1")
                .name("Jonas")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        try {
            System.out.println(studentService.findById(savedStudent.id()));
        } catch (StudentNotFoundException e) {
            System.out.println("Student not found");
        }

        try {
            System.out.println(studentService.findById("7"));
        } catch (StudentNotFoundException e) {
            System.out.println("Student not found");
        }

    }
}
