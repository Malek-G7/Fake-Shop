package atu.ie.Item;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path="api/item")
public class Items {
    Item item1 = new Item("in store item 1",10,1);
    Item item2 = new Item("in store item 1",20,1);
    Item item3 = new Item("in store item 1",30,1);
    ArrayList<Item> items = new ArrayList<Item>(Arrays.asList(item1,item2,item3));

    @PostMapping("/additem")
    public void addItem(@RequestBody Collection<Item> item){
        items.addAll(item);

    }


    @GetMapping("/view")
    public ArrayList<Item> viewItems() {
        return items;
    }
    public Item getItem(UUID uuid) {
        return items.stream().filter(u -> u.getUuid().equals(uuid)).collect(Collectors.toList()).get(0);
    }
}
