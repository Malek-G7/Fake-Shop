package atu.ie.Item;

import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@RestController
@RequestMapping(path = "apt/item")
public class ItemWeb {
    @GetMapping
    public List<Item> getItem(){
        ArrayList<Item> itemList = null;
        try {
            itemList = new ArrayList(ItemLoader.itemListVector("C:\\Users\\g00383507\\OneDrive - Atlantic TU\\CICD\\FakeShop\\src\\main\\java\\atu\\ie\\Item\\ItemList.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return(itemList);
    }



}

