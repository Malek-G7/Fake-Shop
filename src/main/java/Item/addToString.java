package Item;

import java.util.ArrayList;
import java.util.Scanner;

public class addToString {

    /*
    creating a string file so the user can insert the data into the string...as a add fine and then i need to print out taht string..
     */



    public static void main(String[] args) {

        //add string details to a csv file
        ArrayList<String> list = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to the menu");
        System.out.println("Enter 1 to add item");
        System.out.println("Enter 2 to edit item");
        System.out.println("Enter 3 to delete item\n");

        System.out.println("Enter now: ");

        String opt = sc.next();

        switch(opt){
            case "1":   // adding to the array list then take the array list to the csv file
                System.out.println("To begin adding items please fill out the below options");
                System.out.print("Enter Item Number: ");
                String num = sc.next();
                System.out.print("Enter Item Name:");
                String name = sc.next();
                System.out.print("Enter Item Stock:");
                String stock = sc.next();
                System.out.print("Enter Item Price: ");
                String price = sc.next();

                list.add(num + ",");
                list.add(name + ",");
                list.add(stock + ",");
                list.add(price + ",");

                for(int i =0; i <4; i++){
                    System.out.print(list.get(i));
                }
                break;
            case "2":   // copy the details from the original csv file to an array list then change a certain line in the list....use update
                System.out.println("To begin changing details fill out the below details");
                System.out.printf("Enter Item Number:");
                String changeNum = sc.next();
                System.out.println(changeNum);
                break;
            default:
                System.out.println("Invalid entry detected");
                break;
        }



    }

}
