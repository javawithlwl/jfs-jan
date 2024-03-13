package com.careerit.jfs.day4;

public class BiggestThreeNumbers {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int big = biggest(num1, num2, num3);
        System.out.println("Biggest of " + num1 + "," + num2 + "," + num3 + " is " + big);
    }

    public static int biggest(int a, int b, int c) {
        int big;
        if (a > b && a > c) {
            big = a;
        } else if (b > c) {
            big = b;
        } else {
            big = c;
        }
        return big;
    }

}
