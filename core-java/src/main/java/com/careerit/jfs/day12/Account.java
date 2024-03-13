package com.careerit.jfs.day12;

public class Account {

        private String accNumber;
        private String name;
        private double balance;

        public Account(String accNumber, String name, double balance) {
            this.accNumber = accNumber;
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if(amount > 0 && amount <= balance) {
                balance -= amount;
            }else {
                System.out.println("Sorry! Insufficient funds");
            }
        }

        public void deposit(double amount) {
            if(amount > 0) {
                balance += amount;
            }else {
                System.out.println("Sorry! Invalid amount");
            }
        }

        public void showInfo() {
            System.out.println("Account Number : "+accNumber);
            System.out.println("Name           : "+name);
            System.out.println("Balance        : "+balance);
        }

}
