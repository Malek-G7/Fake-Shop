package atu.ie;

import atu.ie.Basket.Basket;
import atu.ie.Basket.Item;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    Item itemItem1;
    Item itemItem2;
    Item itemItem3;
    Item itemItem4;
    int totalSize;
    float totalPrice;

    ArrayList<Item> myItem = new ArrayList<Item>();
    @BeforeEach
    void setUp() {
        itemItem1 = new Item("Drug",200,3);
        itemItem2 = new Item("charger",150,2);
        itemItem3 = new Item("laptop",50,6);
        itemItem4 = new Item("phone",10,8);

        myItem.add(itemItem1);
        myItem.add(itemItem2);
        myItem.add(itemItem3);
        myItem.add(itemItem4);
        myItem.remove(itemItem1);

        Basket basket = new Basket(myItem = new ArrayList<Item>());
        basket.addToBasket(itemItem1);
        basket.addToBasket(itemItem2);
        basket.removeFromBasket(itemItem2);
        totalSize = basket.getBasketSize();
        totalPrice = basket.getTotalPrice();
    }

    @Test
    void testBasketSize(){
        assertEquals(1,totalSize);

    }

    @Test
    void testItemName(){
        assertEquals("Drug", itemItem1.getItemName());
    }

    @Test
    void testItemPrice(){
        assertEquals(600, totalPrice);
    }

    @Test
    void testQuantity(){
        assertEquals(2, itemItem1.getQuantity()-1);
    }


    @Test
    void testDrugsQuantity(){
        Exception drugMsg = assertThrows(IllegalArgumentException.class, () ->{new Item("drug",100,3).getItemName();});
        assertEquals("Sorry but you can only buy 2 drugs at a time",drugMsg.getMessage());
    }

    @AfterEach
    void tearDown() {

    }
}