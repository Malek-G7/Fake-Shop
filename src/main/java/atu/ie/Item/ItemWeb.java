package atu.ie.Item;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/item", method = RequestMethod.POST)
public class ItemWeb {

    @PostMapping("/additem")
    public String addItem(@RequestBody Item items){
        String itemList = "item.csv";

        ArrayList<Item> item = new ArrayList<>();

        try(PrintWriter il = new PrintWriter(itemList)){
            il.write(String.valueOf(item));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return String.valueOf((item));
    }

//    @GetMapping
//    public String newCSVFile(){
//        String itemList = "item.csv";
//
//        try(PrintWriter il = new PrintWriter(itemList)){
//            il.write("Item1");
//            il.write("Item2");
//            il.write("Item3");
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Error creating csv file");
//            e.printStackTrace();
//        }
//
//
//        return (itemList);
//    }
}
