package com.careerit.jfs.exceptions;

import java.util.Scanner;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("Start of the main method");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int res = divide(a, b);
        System.out.println("Result : " + res);
        System.out.println("End of the main method");

    }

    private static int divide(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed");
            e.printStackTrace();
        }
        return res;
    }
}
