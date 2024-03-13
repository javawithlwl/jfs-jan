package com.careerit.jfs.day3;

import java.util.Scanner;

public class DiscountCalculator {

    // Accept the bill amount from the user and calculate the discount amount;
    // if bill amount is greater than 1000 then discount is 10% otherwise no discount

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        double billAmount = sc.nextDouble();
        double discount = 0;
        if(billAmount > 1000){
            discount = billAmount * 0.1;
        }
        double netAmount = billAmount - discount;
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("Discount    :"+discount);
        System.out.println("Net Amount  :"+netAmount);
    }


}
