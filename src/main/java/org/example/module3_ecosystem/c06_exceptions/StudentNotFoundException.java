package org.example.module3_ecosystem.c06_exceptions;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}