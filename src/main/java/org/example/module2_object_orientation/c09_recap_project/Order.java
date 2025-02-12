package org.example.module2_object_orientation.c09_recap_project;

import java.util.ArrayList;

public record Order(
        long id,
        ArrayList<Product> products
) {

}
