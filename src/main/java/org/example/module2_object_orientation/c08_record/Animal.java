package org.example.module2_object_orientation.c08_record;

public record Animal(
        int id,
        String name,
        Species species,
        int age,
        Owner owner
) {
}
