package com.company;

import java.util.Objects;

public class Product {

    private String name, price, discount;

    public Product (String name, String price, String discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;

    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName()) &&
                Objects.equals(getPrice(), product.getPrice()) &&
                Objects.equals(getDiscount(), product.getDiscount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getDiscount());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", discount='" + discount + '\'' +
                '}';
    }

    }

