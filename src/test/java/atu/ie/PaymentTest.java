package atu.ie;

import atu.ie.Oisin.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

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
    void testExpiryDate(){assertEquals("1126",CardDetails.getExpiryDate());}

    @Test
    void testCVV(){assertEquals("123",CardDetails.getCVV());}




    @AfterEach
    void teardown(){

    }

}
