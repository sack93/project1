package com.company.shop;

import java.util.Objects;
import java.util.Scanner;

public class Customer {
    private String login, password;
    private Basket basket;

    public Customer(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public Customer(int id, String login, String password) {
        this.login = login;
        this.password = password;
        basket = new Basket();

    }

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Customer(String login) {

        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Basket userAuth() {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username:");
        username = s.nextLine();
        System.out.println("Enter password:");
        password = s.nextLine();
        if (username.equals(this.login)) password.equals(this.password)) {
            System.out.println("Authentication Successful");
        } else{
            System.out.println("Authentication Failed");
        }
    }


    public Basket addProduct(Product product) {
        basket.add(product);
        return basket;
    }

    public Basket addProduct(Product product) {
        basket.add(product);
        return basket;
    }

    public Basket showCart() {
        System.out.println(basket);
        return basket;


    }

    public void checkout() {
        basket.checkout();
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", basket=" + basket.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(login, customer.login) &&
                Objects.equals(password, customer.password) &&
                Objects.equals(basket, customer.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getBasket());
    }

    public void showBasket() {
    }
}
