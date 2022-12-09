package atu.ie.basket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping(path="api/basket")
public class BasketController {

	private BasketService newService;
	public BasketController(BasketService newService){
		this.newService = newService;
	}

	@GetMapping
	public List<Basket> getBasket(){
		return newService.getBasket();
	}

	@GetMapping ("/{itemPrice}")
	public Basket getBasket(@PathVariable int itemPrice)
	{
		return (Basket) newService.getBasket(itemPrice);
	}

}