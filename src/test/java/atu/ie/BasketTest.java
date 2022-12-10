package atu.ie;

import atu.ie.Basket.Basket;
import atu.ie.Item.Item;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import atu.ie.Basket.Items;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    Items itemItem1;
    Items itemItem2;
    Items itemItem3;
    Items itemItem4;
    int totalSize;
    double totalPrice;

  //  ArrayList<Items> myItems = new ArrayList<Items>();
    ArrayList<Items> myItem = new ArrayList<Items>();
    @BeforeEach
    void setUp() {
        itemItem1 = new Items("Pen",10,3);
        itemItem2 = new Items("Pad",10,2);
        itemItem3 = new Items("Book",20,6);
        itemItem4 = new Items("Page",15,8);



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