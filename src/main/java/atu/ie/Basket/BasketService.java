package atu.ie.Basket;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import atu.ie.Item.Item;

import java.util.ArrayList;
import java.util.List;
import atu.ie.Basket.Basket;

@Service
public class BasketService {
    ArrayList<Items> myItem = new ArrayList<Items>();
    Basket basket = new Basket(myItem);


    public Items getItemByName(@PathVariable String name)
    {
        for (Items item : myItem) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
    public ArrayList<Items> removeItemByName(@PathVariable String name){
        for (Items item : myItem) {
                if (item.getName().equals(name)) {
                    basket.removeFromBasket(item);
                    return myItem;
                }
        }
        return null;
    }

    public void addToBasket(Items item){
        myItem.add(item);
    }

    public Basket getBasketDetails(){
        return basket;
    }

}

