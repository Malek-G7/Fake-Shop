package atu.ie.Basket;

import atu.ie.Basket.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BasketService {

    public List<Basket> getBasket(){
        List<Basket> myBasket = List.of(
                new Basket("Hat",200,1),
                new Basket("Pants",100,2),
                new Basket("Phone",12,1));
        return myBasket;
    }

    public Basket getBasket(@PathVariable int itemPrice)
    {
        Basket myBasket = new Basket("Pants",100,2);
        return myBasket;

    }

}
