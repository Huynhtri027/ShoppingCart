package com.vinitvs.shoppingcart.model;

/**
 * Created by Vinit on 2/28/2018.
 */

public class ListItem {
    private Product product;
    private int quantity;

    public ListItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
