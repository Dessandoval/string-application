package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "milk";
        double priceItem = 3.99;
        int quantity = 1;
        System.out.printf("you bought %d %s for $%.2f%n", quantity, itemName, priceItem);


    }
}
