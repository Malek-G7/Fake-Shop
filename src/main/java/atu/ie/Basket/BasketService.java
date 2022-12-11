package atu.ie.Basket;

import atu.ie.Item.Item;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Service
public class BasketService {
    ArrayList<Item> myItem = new ArrayList<Item>();
    Basket basket = new Basket(myItem);


    public ArrayList<Item> getAllItems() {
        return myItem;
    }

    public Item getItemByName(@PathVariable String name)
    {
        for (Item item : myItem) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
    public ArrayList<Item> removeItemByName(@PathVariable String name){
        for (Item item : myItem) {
                if (item.getName().equals(name)) {
                    basket.removeFromBasket(item);
                    return myItem;
                }
        }
        return null;
    }

    public void addToBasket(Item item){
        myItem.add(item);
    }

    public Basket getBasketDetails(){
        return basket;
    }

}

