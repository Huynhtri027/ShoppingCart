package com.vinitvs.shoppingcart.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vinit on 2/28/2018.
 */

public class Transaction {
    private int id;
    private int customer_id;
    private double subTotalAmount;
    private double taxAmount;
    private double totalAmount;
    private boolean paid;
    private String t_date;
    private String modified_date;
    private List<ListItem> listItem;
    private String jsonListItem;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getSubTotalAmount() {
        return subTotalAmount;
    }

    public void setSubTotalAmount(double subTotalAmount) {
        this.subTotalAmount = subTotalAmount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getT_date() {
        return t_date;
    }

    public void setT_date(String t_date) {
        this.t_date = t_date;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    public List<ListItem> getListItem() {
        Gson gson = new Gson();
        String serializedLineItem = getJsonListItem();
        List<ListItem> result = gson.<ArrayList<ListItem>>fromJson(serializedLineItem, new TypeToken<ArrayList<ListItem>>() {
        }.getType());
        return result;
    }

    public void setListItem(List<ListItem> listItem) {
        Gson gson = new Gson();
        String list = gson.toJson(listItem);
        this.setJsonListItem(list); // setting json string here
    }

    public String getJsonListItem() {
        return jsonListItem;
    }

    public void setJsonListItem(String jsonListItem) {
        this.jsonListItem = jsonListItem;
    }
}
