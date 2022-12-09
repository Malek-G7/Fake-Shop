package atu.ie.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*this will have to use a xml file to read a list of items
most likely will be using a array list code so have to do research on that.
have to look at the code from last year with michale to see how we used the xml file and how we read it.

 */

import java.util.ArrayList;
public class Item {

    private String name;                // row 1
    private double num, price, stock;   // row 0, 3, 2



    public Item(double num, String name, double stock, double price) {
//        this.name = name;
//        this.price = price;
//        this.stock = stock;
//        this.num = num;
        setName(name);
        setNum(num);
        setPrice(price);
        setStock(stock);

    }

    public String getName() {
        return name;
    }
    public double getNum() {
        return num;
    }
    public double getPrice() {
        return price;
    }
    public double getStock() {
        return stock;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setNum(double num) {
        this.num = num;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(double stock) {
        this.stock = stock;
    }


    public static Item fromValues(String [] row){
        double num = Double.parseDouble(row[0]);
        String name = row[1];
        double price = Double.parseDouble(row[3]);
        double stock = Double.parseDouble(row[2]);

        return new Item(num, name, stock, price);
    }

    @Override
    public String toString(){
        return "Items List{" +
                "Number = " + num + "\' " +
                "Name " + name + "\' " +
                "Stock = " + stock + "\' " +
                "Price = " + price + "\' " +
                '}';
    }
}



