//package atu.ie.Item;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ItemAddTest {
//
//    @Test
//    public void addItem() {
//        Item item = new Item("item 1", 10, 999);
//        Item item2 = new Item("item 2", 10, 1);
//
//        ArrayList<Item> items = new ArrayList<Item>(Arrays.asList(item));
//
//        items.add(item2);
//
//        assertEquals(2, items.size());
//        assertTrue(items.contains(item));
//        assertTrue(items.contains(item2));
//    }
//
//    @Test
//    public void viewItemTest(){
//        Item item = new Item("item 1", 10, 999);
//        Item item2 = new Item("item 2", 10, 1);
//
//        Items items = new Items();
//        items.addItem(item);
//        items.addItem(item2);
//
//        assertEquals(Arrays.asList(item, item2), items.viewItems());
//
//    }
//
//    @Test
//    void viewItems() {
//    }
//}