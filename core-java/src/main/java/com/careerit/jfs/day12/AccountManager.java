package com.careerit.jfs.day12;

public class AccountManager {

    public static void main(String[] args) {

        Account acc1 = new Account("ACC123", "Krish", 10000);
        Account acc2 = new Account("ACC124", "Manoj", 20000);

        acc1.showInfo();
        System.out.println("-------------------------------------------------");
        acc2.showInfo();

        acc1.withdraw(5000);
        acc1.deposit(1000);
        acc1.showInfo();
        System.out.println("-------------------------------------------------");
        acc2.showInfo();


    }
}
