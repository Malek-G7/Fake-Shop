package atu.ie.Payment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payment {
    private String cardNumber;
    private String expiryDate;
    private String CVV;

    public Payment(@JsonProperty ("cardNumber") String cardNumber, @JsonProperty("expiryDate") String expiryDate,@JsonProperty("CVV") String CVV) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }

    public String getCardNum() {

        if(cardNumber.length()==20) { // 16 numbers and a space between each
            System.out.println("card number entered");
        }
        else{
            System.out.println("incorrect number entered");
        }
        return cardNumber;
    }

    public String getExpiryDate() {
        if(expiryDate.length()==4){
            System.out.println("expiry date entered");
        }
        else{
            System.out.println("incorrect date entered");
        }


        return expiryDate;
    }

    public String getCVV() {
        if(CVV.length()==3){
            System.out.println("CVV entered");
        }
        else{
            System.out.println("invalid CVV");
        }
        return CVV;
    }

}


