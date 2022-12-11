package atu.ie;

import atu.ie.Payment.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTests {

    Payment CardDetails;

    ArrayList<Payment> myPayment = new ArrayList<Payment>();

    @BeforeEach()
    void setUp() {
        CardDetails = new Payment("1234 4321 1234 4321","1126","123");

        myPayment.add(CardDetails);

    }

    @Test
    void testNum(){ assertEquals("1234 4321 1234 4321", CardDetails.getCardNum());}

    @Test
    void testNumFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Payment("1234 1234", "1126", "123");});
        assertEquals("invalid card number", exMessage.getMessage());
    }

    @Test
    void testExpiryDate(){assertEquals("1126",CardDetails.getExpiryDate());}

    @Test
    void testExpiryDateFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Payment("1234 4321 1234 4321", "11", "123");});
        assertEquals("invalid date format", exMessage.getMessage());
    }

    @Test
    void testCVV(){assertEquals("123",CardDetails.getCVV());}

    @Test
    void testCVVFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {new Payment("1234 4321 1234 4321", "1126", "12");});

        assertEquals("invalid CVV", exMessage.getMessage());

    }


    @AfterEach
    void teardown(){

    }

}