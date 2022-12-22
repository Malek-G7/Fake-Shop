package atu.ie;

import atu.ie.Basket.Basket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    Basket basketItem1;
    Basket basketItem2;
    Basket basketItem3;
    Basket basketItem4;

    ArrayList<Basket> myBasket = new ArrayList<Basket>();
    @BeforeEach
    void setUp() {
        basketItem1 = new Basket("Drug",200,3);
        basketItem2 = new Basket("charger",150,2);
        basketItem3 = new Basket("laptop",50,6);
        basketItem4 = new Basket("phone",10,8);

        myBasket.add(basketItem1);
        myBasket.add(basketItem2);
        myBasket.add(basketItem3);
        myBasket.add(basketItem4);

        myBasket.remove(basketItem1);
    }

    @Test
    void testBasketSize(){
        assertEquals(3,myBasket.size());
    }

    @Test
    void testItemName(){
        assertEquals("Drug", basketItem1.getItemName());
    }

    @Test
    void testItemPrice(){
        assertEquals(150,basketItem2.getItemPrice());
    }

    @Test
    void testQuantity(){
        assertEquals(1, basketItem2.getQuantity() -1);
    }


    @Test
    void testDrugsQuantity(){
        Exception drugMsg = assertThrows(IllegalArgumentException.class, () ->{new Basket("drug",100,3).getItemName();});
        assertEquals("Sorry but you can only buy 2 drugs at a time",drugMsg.getMessage());
    }

    @AfterEach
    void tearDown() {

    }
}