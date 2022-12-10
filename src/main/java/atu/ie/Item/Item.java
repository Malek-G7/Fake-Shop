package atu.ie.Item;

/*this will have to use a xml file to read a list of items
most likely will be using a array list code so have to do research on that.
have to look at the code from last year with michale to see how we used the xml file and how we read it.

 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Item {

    private String name;                // row 1
    private String num, price, stock;   // row 0, 3, 2

//    public Item(double num, String name, double stock, double price){
//        this.name = name;
//        this.price = price;
//        this.stock = stock;
//        this.num = num;
//    }

    public Item(@JsonProperty("name") String name, @JsonProperty("id") String num, @JsonProperty("price") String price, @JsonProperty("stock") String stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public String getNum() {
        return num;
    }
    public String getPrice() {
        return price;
    }
    public String getStock() {
        return stock;
    }
}
