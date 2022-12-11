package atu.ie.Item;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping(path="api/item")
public class ItemAdd {

    ArrayList<Item> items = new ArrayList<>();

    @PostMapping("/additem")
    public void addItem(@RequestBody Collection<Item> item){
        items.addAll(item);

    }


    @GetMapping("/view")
    public ArrayList<Item> viewItems() {

        return items;
    }
}
