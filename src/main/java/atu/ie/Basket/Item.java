package atu.ie.Basket;

public class Item {
    private String itemName;
    private float itemPrice;
    private int quantity;

    public Item(String itemName, float itemPrice, int quantity) {
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
        return itemPrice;
    }

    public int getQuantity(){
        return quantity;
    }


}
