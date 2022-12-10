package atu.ie.Item;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/additem", method = RequestMethod.POST)
public class ItemWeb {

    @PostMapping
    public String addItem(){
        String itemList = "item.csv";

        ArrayList<Item> item = new ArrayList<>();

        try(PrintWriter il = new PrintWriter(itemList)){
            for(Item item1: item){
                il.write(String.valueOf(item1));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return String.valueOf((item));
    }
}
