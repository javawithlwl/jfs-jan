package com.careerit.jfs.day7;

import java.util.Scanner;

public class AtmOptions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Withdraw 2. Deposit 3. Balance 4. Exit");
            System.out.println("Enter your choice :");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("You have selected withdraw option");
                    break;
                case 2:
                    System.out.println("You have selected deposit option");
                    break;
                case 3:
                    System.out.println("You have selected balance option");
                    break;
                case 4:
                    System.out.println("You have selected exit option");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
