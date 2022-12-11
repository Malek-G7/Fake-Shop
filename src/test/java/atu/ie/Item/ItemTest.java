package atu.ie.Item;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    public void ItemTest(){

        Item item = new Item("Phone", 999.99, 10);

        assertEquals("Phone", item.getName());
        assertEquals(999.99, item.getPrice());
        assertEquals(10, item.getQuantity());


    }

    @Test
    public void itemSetTest(){

        Item item = new Item("Phone", 999.99, 10);
        UUID uuid = UUID.randomUUID();

        item.setName("pen");
        item.setPrice(1.0);
        item.setQuantity(30);
        item.setUuid(uuid);



        assertEquals("pen", item.getName());
        assertEquals(1.0, item.getPrice());
        assertEquals(30, item.getQuantity());
        assertEquals(uuid, item.getUuid());

    }
}