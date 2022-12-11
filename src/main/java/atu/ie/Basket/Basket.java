package atu.ie.Basket;

import java.util.ArrayList;
import java.util.ListIterator;
import atu.ie.Item.Item;

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

    public ArrayList<Item> getItems(){
        return myItem ;
    }

    public void removeFromBasket(Item item){
        this.myItem.remove(item);
    }

    public double getTotalPrice(){
        Item item;
        ListIterator<Item> iterator = myItem.listIterator();
        double total=0;
        while(iterator.hasNext()){
            item = iterator.next();
            total = total + (item.getPrice() * item.getQuantity());
        }
        return total;
    }

}
