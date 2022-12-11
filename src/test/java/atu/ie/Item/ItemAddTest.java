package atu.ie.Item;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ItemAddTest {

    @Test
    public void addItem() {
        Item item = new Item(1, "iPhone", 999.99);
        Item item2 = new Item(2, "pen", 0.99);

        ItemAdd itemAdd = new ItemAdd();

        itemAdd.addItem(Arrays.asList(item, item2));

        assertEquals(2, itemAdd.viewItems().size());
        assertTrue(itemAdd.viewItems().contains(item));
        assertTrue(itemAdd.viewItems().contains(item2));
    }

    @Test
    public void viewItemTest(){
        Item item = new Item(1, "iPhone", 999.99);
        Item item2 = new Item(2, "pen", 0.99);

        ItemAdd itemAdd = new ItemAdd();
        itemAdd.addItem(Arrays.asList(item, item2));

        assertEquals(Arrays.asList(item, item2), itemAdd.viewItems());

    }

    @Test
    void viewItems() {
    }
}