package atu.ie.Basket;

import atu.ie.Basket.Basket;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@AllArgsConstructor
@Service
public class BasketService {

    private final BasketRepo basketRepo;

    public List<Basket> getBasket(){
        return basketRepo.findAll();
    }

    public void saveBasket(Basket basket)
    {
        basketRepo.save(basket);
    }

    public Basket findByItemName(String itemName)
    {
        return basketRepo.findByItemName(itemName);
    }

    public void deleteBasketItem(Long count){
        basketRepo.deleteById(count);
    }

    public Basket getBasket(@PathVariable int itemPrice)
    {
        Basket myBasket = new Basket("Pants",100,2);
        return myBasket;
    }

}
