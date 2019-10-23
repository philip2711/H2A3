package com.example.h2a2;

import java.io.Serializable;

public class Menu implements Serializable {

    private int menuID;
    private String price;
    private String fname;
    private String description;
    private int quantity;



    public Menu(int menuID, String price, String fname, String description, int quantity) {
        this.menuID = menuID;
        this.price = price;
        this.fname = fname;
        this.description = description;
        this.quantity = quantity;

    }

    public Menu(int menuID) {
        this.menuID = FakeDatabase.getMenuByID(menuID).getMenuID();
        this.price = FakeDatabase.getMenuByID(menuID).getPrice();
        this.fname = FakeDatabase.getMenuByID(menuID).getFname();
        this.description = FakeDatabase.getMenuByID(menuID).getDescription();
        this.quantity = FakeDatabase.getMenuByID(menuID).getQuantity();
    }

    public int getMenuID() { return menuID; }

    public void setMenuId(int menuId) {
        this.menuID = menuID;
    }

    public String getPrice() { return price; }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
