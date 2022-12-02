package Oisin;

import java.util.Scanner;

public class Payment {
    private long cardNum;
    private Long expiryDate;
    private Long CVV;

    public Payment(Long cardNum, Long expiryDate, Long CVV) {
        this.cardNum = cardNum;
        this.expiryDate = expiryDate;
        this.CVV = CVV;
    }

    public long getCardNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Card Number");
        long num = input.nextLong();
        System.out.println("Card Number: " + num);
        input.close();
    }

    public long getExpiryDate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Expiry date");
        long num = input.nextLong();
        System.out.println("Expiry Date: " + num);
        input.close();
    }

    public long getCVV() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your CVV Number");
        long num = input.nextLong();
        System.out.println("CVV value: " + num);
        input.close();
    }

}

