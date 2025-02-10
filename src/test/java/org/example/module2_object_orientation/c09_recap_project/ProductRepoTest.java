package org.example.module2_object_orientation.c09_recap_project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    // GIVEN > WHEN > THEN

    @Test
    void add_addProduct_RepoContainsProduct() {
        ProductRepo repo = new ProductRepo();
        Product product = new Product(1, "name", "1.4", "dev");

        repo.add(product);

        assertTrue(repo.getRepository().contains(product));
        assertEquals(1, repo.getRepository().size());
    }
}