package com.company;

import com.company.Basket;
import com.company.Category;
import com.company.Customer;
import com.company.Product;

public class Catalog {

    public static void main(String[] args) {

        Product iPhone1 = new Product("11 pro", "30000 UAH", "5%");
        Product iPhone2 = new Product("11 pro max", "40000 UAH", "5%");
        Product iPhone3 = new Product("11", "20000 UAH", "5%");

        Product MacBook1 = new Product("Pro2019", "55000 UAH","7%");
        Product MacBook2 = new Product("Air2019", "35000 UAH","7%");

        Product iPad1 = new Product("Pro2019", "25000 UAH","10%");
        Product iPad2 = new Product("2019", "15000 UAH","10%");

        Product iMac1 = new Product("Pro2019", "250000 UAH","3%");
        Product iMac2 = new Product("2019", "50000 UAH","11%");

        Category phones = new Category("iPhone", new Product[]{iPhone1, iPhone2, iPhone3});
        Category laptops = new Category("MacBook", new Product[]{MacBook1, MacBook2});
        Category tablets = new Category("iPad", new Product[]{iPad1, iPad2});
        Category pc = new Category("iPad", new Product[]{iMac1, iMac2});

        Customer user1 = new Customer("Bog Volcano", "12101993", new Basket(new Product[]{iPhone1}));
        Customer user2 = new Customer("Wog Volcano", "17091994",new Basket(new Product[]{iMac1}));
    }
}
