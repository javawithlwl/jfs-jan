package com.careerit.jfs.day3;

import java.util.Scanner;

// Accept the num from the user and print whether it is even or odd
public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("The num "+num+" is even");
        }else{
            System.out.println("The num "+num+" is odd");
        }
    }
}
