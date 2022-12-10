package atu.ie.Payment;

public class Payment {
    private String cardNum;
    private String expiryDate;
    private String CVV;

    public Payment(String cardNum, String expiryDate, String CVV) {
        this.cardNum = cardNum;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }

    public String getCardNum() {

        if(cardNum.length()==20) { // 16 numbers and a space between each
            System.out.println("card number entered");
        }
        else{
            System.out.println("incorrect number entered");
        }
        return cardNum;
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


