package atu.ie.Item;

import  java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ItemLoader {
    public static ArrayList<Item> itemListVector(String path) throws IOException{
        ArrayList<Item> itemlist = new ArrayList<>();

        BufferedReader line = new BufferedReader(new FileReader(path));
        try (ItemReader reader = new ItemReader(line))
        {
            String[] row = null;

            while((row = reader.readRow()) != null)
            {
                itemlist.add(Item.fromValues(row));
            }
        }
        return itemlist;
    }
}
