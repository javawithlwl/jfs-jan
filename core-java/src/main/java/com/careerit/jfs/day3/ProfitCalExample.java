package com.careerit.jfs.day3;

import java.util.Scanner;

// Accept the cost price and selling price of the product, calculate the profit or loss
public class ProfitCalExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price:");
        double sp = sc.nextDouble();
        if(cp > sp) {
            double loss = cp - sp;
            System.out.println("You made a loss :" + loss);
        }else if(cp < sp) {
            double profit = sp - cp;
            System.out.println("You made a profit :" + profit);
        }else {
            System.out.println("No profit no loss");
        }
    }
}
