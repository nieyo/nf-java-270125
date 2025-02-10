package org.example.module2_object_orientation.c09_recap_project;

import java.util.ArrayList;
import java.util.Objects;

public class ProductRepo {
    private ArrayList<Product> repository;

    // add methods to add, remove, and get products (single product and all products)


    public ProductRepo() {
        repository = new ArrayList<>();
    }

    public ProductRepo(ArrayList<Product> repository) {
        this.repository = repository;
    }

    public ArrayList<Product> getRepository() {
        return repository;
    }

    public void setRepository(ArrayList<Product> repository) {
        this.repository = repository;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(repository);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "repository=" + repository +
                '}';
    }

    public void add(Product product) {
        repository.add(product);
    }
}
