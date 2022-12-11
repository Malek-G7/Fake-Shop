package atu.ie.Basket;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Items {
    private String name;
    private int price;
    private int quantity;
    private UUID uuid ;
    public Items(@JsonProperty("name") String name, @JsonProperty("price") int price,@JsonProperty("quantity") int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
