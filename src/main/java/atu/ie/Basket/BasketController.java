package atu.ie.Basket;
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
	public List<Item> getBasket(){
		return newService.getBasket();
	}

	@GetMapping ("/{itemPrice}")
	public Item getBasket(@PathVariable int itemPrice)
	{
		return (Item) newService.getBasket(itemPrice);
	}

}