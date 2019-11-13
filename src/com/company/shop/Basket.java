package com.company.shop;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Basket {

    ArrayList<Product> basketContents = new ArrayList<>();

    public Basket() {
        this.basketContents = basketContents;
    }

    public Basket(Product[] products) {
        ArrayList<Product> cartContents = new ArrayList<>();
    }

    public void add(Product product) {
        basketContents.add(product);
    }

    public void checkout() {
        double total = 0;
        try (PrintWriter printWriter = new PrintWriter("Checkout")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
