package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Category {

    private String name;

    Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(getName(), category.getName()) &&
                Arrays.equals(getProducts(), category.getProducts());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(getProducts());
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
