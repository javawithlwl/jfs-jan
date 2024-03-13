package com.careerit.jfs.oop.constructor;

public class Account {

    private int accno;
    private String name;

    private double balance;

    public Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public void showDetails() {
        System.out.println("Accno :"+accno);
        System.out.println("Name :"+name);
        System.out.println("Balance :"+balance);
    }

    public int getAccno() {
        return accno;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
