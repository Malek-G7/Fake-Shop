package atu.ie;

public class Basket {
    private String itemName;
    private float itemPrice;
    private int quantity;


    public Basket(String itemName, float itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }


    public String getItemName(){
        if(itemName == "drug"){
            if(quantity>2){
                throw new IllegalArgumentException("Sorry but you can only buy 2 drugs at a time");
            }
        }
        return itemName;
    }

    public float getItemPrice(){
        if(itemPrice>100) {
            System.out.println("You are too poor for this product");
        }
        return itemPrice;
    }

    public int getQuantity(){
        return quantity;
    }






}
