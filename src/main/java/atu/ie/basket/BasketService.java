package atu.ie.basket;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BasketService {

    public List<Item> getBasket(){
        List<Item> myItem = List.of(
                new Item("Hat",200,1),
                new Item("Pants",100,2),
                new Item("Phone",12,1));
        return myItem;
    }

    public Item getBasket(@PathVariable int itemPrice)
    {
        Item myItem = new Item("Pants",100,2);
        return myItem;
    }

}
