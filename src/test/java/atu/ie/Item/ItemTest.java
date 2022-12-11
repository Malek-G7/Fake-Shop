package atu.ie.Item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void itemTest(){
        Item item = new Item(1, "iPhone", 999.99);

        assertEquals(1, item.getId());
        assertEquals("iPhone", item.getName());
        assertEquals(999.99, item.getPrice());
    }

    @Test
    public void testToString(){
        Item item = new Item(1, "iPhone", 999.99);

        assertEquals("Items List{Number = 1.0\' Name iPhone\' Price = 999.99\' }", item.toString());
    }

    @AfterEach
    void tearDown() {
    }
}