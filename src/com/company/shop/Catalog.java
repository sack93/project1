package com.company.shop;

import java.util.Scanner;

public class Catalog {

    public static void main(String[] args) {

        Product iPhone1 = new Product("11 pro", "30000 UAH", "5%");
        Product iPhone2 = new Product("11 pro max", "40000 UAH", "5%");
        Product iPhone3 = new Product("11", "20000 UAH", "5%");

        Product MacBook1 = new Product("Pro2019", "55000 UAH", "7%");
        Product MacBook2 = new Product("Air2019", "35000 UAH", "7%");

        Product iPad1 = new Product("Pro2019", "25000 UAH", "10%");
        Product iPad2 = new Product("2019", "15000 UAH", "10%");

        Product iMac1 = new Product("Pro2019", "250000 UAH", "3%");
        Product iMac2 = new Product("2019", "50000 UAH", "11%");

        Category phones = new Category("iPhone", new Product[]{iPhone1, iPhone2, iPhone3});
        Category laptops = new Category("MacBook", new Product[]{MacBook1, MacBook2});
        Category tablets = new Category("iPad", new Product[]{iPad1, iPad2});
        Category pc = new Category("iPad", new Product[]{iMac1, iMac2});

        Customer user1 = new Customer("Bog Volcano", "12101993", new Basket(new Product[]{iPhone1}));

        System.out.println("     ");
        int pick;
        Scanner main = new Scanner(System.in);
        System.out.println("Main menu");
        System.out.println("1:Login");
        System.out.println("2:Show Catalog");
        System.out.println("3:Buy Product");
        System.out.println("4:Show my Basket");
        System.out.println("5:Checkout");
        System.out.println("Please Choose");
        pick = main.nextInt();

        switch (pick) {
            case 1:
                user1.userAuth();
                break;
            case 2:
                phones.showContent();
                break;
            case 3:
                user1.showBasket();
                break;
            case 4:
                user1.checkout();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }

    }
}
