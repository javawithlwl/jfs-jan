package com.careerit.jfs.day4;

public class TernaryOperator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;
        int num3 = 30;
        int big = num1 > num2 && num1 > num3 ? num1 : num2 > num3 ? num2 : num3;
        System.out.println("Biggest of " + num1 + "," + num2 + " is " + big);
    }
}
