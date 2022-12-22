package atu.ie.Item;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private UUID uuid ;
    public Item(@JsonProperty("name") String name, @JsonProperty("price") double price, @JsonProperty("quantity") int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
