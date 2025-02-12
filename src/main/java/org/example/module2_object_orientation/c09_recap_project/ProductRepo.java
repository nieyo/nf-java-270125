package org.example.module2_object_orientation.c09_recap_project;

import java.util.ArrayList;
import java.util.Objects;

public class ProductRepo {
    private ArrayList<Product> products;

    // Constructor

    public ProductRepo() {
        products = new ArrayList<>();
    }

    // Getter & Setter

    public ArrayList<Product> getProducts() {
        return products;
    }

    // equals & hashCode

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }

    // toString

    @Override
    public String toString() {
        return "ProductRepo{" +
                "repository=" + products +
                '}';
    }

    // custom methods

    public void add(Product product) {
        products.add(product);
    }

    public void add(long id) {
        products.remove(get(id));
    }

    public Product get(long id) {
        for (Product product : products) {
            if (product.id() == id){
                return product;
            }
        }
        return null;
    }
}
