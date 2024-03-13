package com.careerit.jfs.day2;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of P:");
        double P = sc.nextDouble();
        System.out.println("Enter the value of R:");
        double R = sc.nextDouble();
        System.out.println("Enter the value of T:");
        double T = sc.nextDouble();

        double SI = (P * T * R) / 100;
        double totalAmount = P + SI;
        System.out.println("For amount " + P + " , duration " + T + " (years) and rate interest " + R+"%");
        System.out.println("Interest amount :" + SI);
        System.out.println("Total amount    :" + totalAmount);

    }
}
