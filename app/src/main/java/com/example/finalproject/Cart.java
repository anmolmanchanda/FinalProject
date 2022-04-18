package com.example.finalproject;

public class Cart {

    private int productID;
    private String product_name;
    private  String description;
    private float price;
    private int quantity;
    public Cart(){

    }
    public Cart(int ProductID,String PName, String PDescription,float PPrice ,int Quantity){//cart class constructor to set values
        this.productID=ProductID;
        this.product_name=PName;
        this.description=PDescription;
        this.price=PPrice;
        this.quantity=Quantity;
    }

    //functions to get data objects of class
    public int getProductIDId(){
        return this.productID;
    }
    public String getProduct_name(){
        return this.product_name;
    }
    public String getDescription(){
        return this.description;
    }
    public float getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }


}

