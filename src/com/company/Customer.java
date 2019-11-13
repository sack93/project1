package com.company;

public class Customer {
    private String login, password;

    Basket basket;

    public Customer(String login, String password, Basket basket) {
        this.basket = basket;
        this.login = login;
        this.password = password;
    }

    public Customer() {
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
}
