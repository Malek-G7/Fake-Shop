package atu.ie.Basket;

import java.util.ArrayList;
import java.util.ListIterator;
import atu.ie.Basket.Items;

public class Basket {
    ArrayList<Items> myItem;

    public Basket(ArrayList<Items> myItem) {
        this.myItem = myItem;
    }

    public void addToBasket(Items item){
        this.myItem.add(item);
    }

    public int getBasketSize(){
        return this.myItem.size();
    }

    public void removeFromBasket(Items item){
        this.myItem.remove(item);
    }

    public double getTotalPrice(){
        Items item;
        ListIterator<Items> iterator = myItem.listIterator();
        double total=0;
        while(iterator.hasNext()){
            item = iterator.next();
            total = total + (item.getPrice() * item.getQuantity());
        }
        return total;
    }

}
