package com.careerit.jfs.day4;

import java.util.Scanner;

public class BillCalculator {

    // Calculate the total bill amount; if the bill amount is greater than 1000 then give 10% discount or
    // if customer is a premium customer then give 10% discount otherwise give 5% discount

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double amount = sc.nextDouble();
        System.out.println("Enter the customer type (r-regular/p-premium) ");
        String type = sc.next();
        double discount = 0;
        if (type.equals("p") || amount >= 1000) {
            discount = amount * 0.1;
        } else {
            discount = amount * 0.05;
        }
        System.out.println("The bill amount is :" + amount);
        System.out.println("The customer type is :" + type);
        System.out.println("The discount amount is :" + discount);


    }


}
