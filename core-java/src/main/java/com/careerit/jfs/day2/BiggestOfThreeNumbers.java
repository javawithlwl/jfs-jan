package com.careerit.jfs.day2;

public class BiggestOfThreeNumbers {

    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 55;
        int num3 = 25;

        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("The max number is :" + max);

    }
}
