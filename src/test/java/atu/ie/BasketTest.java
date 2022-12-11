package atu.ie;

import atu.ie.Basket.Basket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import atu.ie.Item.Item;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    Item itemItem1;
    Item itemItem2;
    Item itemItem3;
    Item itemItem4;
    int totalSize;
    double totalPrice;

  //  ArrayList<Items> myItems = new ArrayList<Items>();
    ArrayList<Item> myItem = new ArrayList<Item>();
    @BeforeEach
    void setUp() {
        itemItem1 = new Item("Pen",10,3);
        itemItem2 = new Item("Pad",10,2);
        itemItem3 = new Item("Book",20,6);
        itemItem4 = new Item("Page",15,8);



        Basket basket = new Basket(myItem);
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
        assertEquals("Pen", itemItem1.getName());
    }

    @Test
    void testItemPrice(){
        assertEquals(30, totalPrice);
    }

    @Test
    void testQuantity(){
       assertEquals(3, itemItem1.getQuantity());
    }

    @AfterEach
    void tearDown() {

    }
}