package atu.ie.Users;

import atu.ie.Basket.Basket;
import atu.ie.Basket.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String name ;
    private String email ;
    private String password ;
    private UUID id ;

    public Basket basket ;



    public User(@JsonProperty("name") String name, @JsonProperty("email") String email, @JsonProperty("password") String password) {
        setName(name);
        setEmail(email);
        setPassword(password);
        ArrayList <Item> list = new ArrayList<Item>();
        this.basket = new Basket(list);
    }

    public void addToBasket(){
        Item item = new Item("item",2,1);
        basket.addToBasket(item);
    }
    public void setName(String name) {
        if(name.length()>2){
            this.name = name;
        }
        else throw new IllegalArgumentException("name must be > 2 characters") ;
    }

    public void setEmail(String email) {
        if(email.length()>2){
            this.email = email;
        }
        else throw new IllegalArgumentException("email must be > 2 characters") ;

    }

    public void setPassword(String password) {
        if(password.length()>2){
            this.password = password;
        }
        else throw new IllegalArgumentException("password must be > 2 characters") ;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UUID getId() {
        return id;
    }

    public Basket getBasket() {
        return basket;
    }

}
