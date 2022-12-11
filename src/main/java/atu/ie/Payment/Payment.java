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
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCardNumber(String cardNumber) {
        if(cardNumber.length()>15){
            this.cardNumber = cardNumber;
        }
        else throw new IllegalArgumentException("invalid card number");
    }

    public void setExpiryDate(String expiryDate) {
        if(expiryDate.length()>3){
            this.expiryDate = expiryDate;
        }
        else throw new IllegalArgumentException("invalid date format");
    }

    public void setCVV(String CVV) {
        if(CVV.length()>2){
            this.CVV = CVV;
        }
        else throw new IllegalArgumentException("invalid CVV");
    }
}


