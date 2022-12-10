package atu.ie.Payment;

import java.util.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(path = "api/Payment")
public class PaymentApplication {

    @GetMapping
    public List<Payment> getPaymentDetails(){

        List<Payment> myPaymentDetails= List.of(
                new Payment("1234 1234 1234 1234", "1126","123"));

        return(myPaymentDetails);
    }
}

