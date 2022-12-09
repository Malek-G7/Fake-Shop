package atu.ie.Basket;
import atu.ie.Basket.Item;

import java.util.ArrayList;
import java.util.ListIterator;

public class Basket {
    ArrayList<Item> myItem;

    public Basket(ArrayList<Item> myItem) {
        this.myItem = myItem;
    }

    public void addToBasket(Item item){
        this.myItem.add(item);
    }

    public int getBasketSize(){
        return this.myItem.size();
    }

    public void removeFromBasket(Item item){
        this.myItem.remove(item);
    }

    public float getTotalPrice(){
        Item item;
        ListIterator<Item> iterator = myItem.listIterator();
        float total=0;
        while(iterator.hasNext()){
            item = iterator.next();
            total = total + (item.getItemPrice() * item.getQuantity());
        }
        return total;
    }

}