package atu.ie.Basket;
import org.springframework.web.bind.annotation.*;

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

	//Save Operation
	@PostMapping("")
	public void saveBasket(@RequestBody Basket basket){
		newService.saveBasket(basket);
	}

	//Find Item by name
	@GetMapping("/itemName/{itemName}")
	public Basket getItemName(@PathVariable("itemName")String itemName)
	{
		return newService.findByItemName(itemName);
	}

	@DeleteMapping("/delete/{count}")
	public void deleteItem(@PathVariable("count") Long count)
	{
		newService.deleteBasketItem(count);
	}



}