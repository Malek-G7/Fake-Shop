package atu.ie.Basket;
import org.springframework.web.bind.annotation.*;
import atu.ie.Item.Item;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping(path="api/basket")
public class BasketController {

	private BasketService newService;
	public BasketController(BasketService newService){
		this.newService = newService;
	}

	@GetMapping
	public Basket getBasketDetails(){
		return newService.getBasketDetails();
	}

	@GetMapping("/items")
	public ArrayList<Items> getAllItems(){
		return newService.getAllItems();
	}

	@GetMapping("/items/find/{name}")
	public Items getItemByName(@PathVariable String name){return (Items) newService.getItemByName(name);}

	@PostMapping("")
	public void saveItem(@RequestBody Items item){
		newService.addToBasket(item);
	}

	@DeleteMapping("/items/remove/{name}")
	public ArrayList<Items>  removeItemByName(@PathVariable String name){return newService.removeItemByName(name);}

}