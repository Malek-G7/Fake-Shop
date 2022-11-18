package atu.ie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping(path="api/basket")
public class BasketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasketApplication.class, args);
	}

	@GetMapping
	public List<Basket> getBasket(){
		List<Basket> myBasket = List.of(
				new Basket("Hat",200,1),
				new Basket("Pants",100,2),
				new Basket("Phone",12,1));
		return myBasket;
	}

}
