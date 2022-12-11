package atu.ie.Item;

/*this will have to use a xml file to read a list of items
most likely will be using a array list code so have to do research on that.
have to look at the code from last year with michale to see how we used the xml file and how we read it.

 */

import java.util.ArrayList;

public class Item {

    private String name;                // row 1
    private double Id, price;   // row 0, 3, 2

    public Item(double Id, String name, double price){
        this.name = name;
        this.price = price;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }
    public double getNum() {
        return Id;
    }
    public double getPrice() {
        return price;
    }



    @Override
    public String toString(){
        return "Items List{" +
                "Number = " + Id + "\' " +
                "Name " + name + "\' " +
                "Price = " + price + "\' " +
                '}';
    }
}
