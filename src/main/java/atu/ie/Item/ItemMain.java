package atu.ie.Item;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ItemMain {

    public static void main(String[] args) throws IOException {
        ArrayList<Item> itemList = new ArrayList(ItemLoader.itemListVector("C:\\Users\\g00383507\\OneDrive - Atlantic TU\\CICD\\FakeShop\\src\\main\\java\\atu\\ie\\Item\\ItemList.csv"));


        System.out.println("List of Items\n");

        List<Item> item1 = itemList.stream()
                .sorted(Comparator.comparingDouble(Item::getNum))
                .collect(Collectors.toList());
        item1.forEach(System.out::println);
    }
}

