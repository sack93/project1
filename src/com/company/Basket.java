package com.company;

public class Basket {

    com.company.Product[] purchasedProducts;
    public Basket(com.company.Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }


    public com.company.Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(com.company.Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

}
