package atu.ie.Item;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@RestController
@RequestMapping(path = "/api/item", method = RequestMethod.POST)
public class ItemService {


//    @PostMapping
//    public void addItem(){
//
//
//        String itemList = "item.csv";
//
//        ArrayList<Item> item = new ArrayList<>();
//
//        try(PrintWriter il = new PrintWriter(itemList)){
//            il.write("item1");
//            il.write("id: 1");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
