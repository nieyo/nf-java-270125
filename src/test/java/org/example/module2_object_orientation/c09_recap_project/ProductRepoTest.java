package org.example.module2_object_orientation.c09_recap_project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    // GIVEN > WHEN > THEN

    private ProductRepo repo;
    private final Product product1 = new Product(1, "TestProduct");
    private final Product product2 = new Product(2, "AnotherProduct");

    @BeforeEach
    void setUp() {
        repo = new ProductRepo();
        repo.add(product1);
        repo.add(product2);
    }

    @Test
    void add_WhenProductIsAdded_ThenRepositoryContainsIt() {
        Product product = new Product(1, "name");

        repo.add(product);

        assertTrue(repo.getProducts().contains(product));
    }

    @Test
    void get_ById_ShouldReturnCorrectProduct() {
        Product result = repo.get(2L);
        assertEquals(product2, result);
    }

}