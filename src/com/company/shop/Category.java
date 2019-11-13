package com.company.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {
    private String name;
    private List<Product> productsArray = new ArrayList<>();

    public Category(String name, ArrayList<Product> productsArray) {
        this.name = name;
        this.productsArray = productsArray;
    }

    public Category(String name) {
        this.name = name;

    }

    public Category(String iPhone, Product[] products) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductsArray() {
        return productsArray;
    }

    public void setProductsArray(List<Product> productsArray) {
        this.productsArray = productsArray;
    }

    public void addProduct(Product product) {
        productsArray.add(product);
    }

    public void showContent() {
        System.out.println(this.productsArray.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name()) &&
                Objects.equals(productsArray, category.productsArray);
    }

    private Object name() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productsArray);
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product product : productsArray) {
            result.append(product);
        }
    }

    return result.toString();
}

