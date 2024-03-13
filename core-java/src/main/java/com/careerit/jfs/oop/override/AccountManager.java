package com.careerit.jfs.oop.override;

import java.util.List;

public class AccountManager {

    public static void main(String[] args) {


        List<Account> accounts = getAccounts();

        int scount = 0;
        int ccount = 0;

        for (Account acc : accounts) {
            if (acc instanceof SavingAccount) {
                scount++;
            } else if (acc instanceof CurrentAccount) {
                ccount++;
            }
        }
        System.out.println("Total saving accounts : " + scount);
        System.out.println("Total current accounts : " + ccount);

        for(Account acc:accounts) {
            acc.withdraw(100);
        }

    }

    public static List<Account> getAccounts() {
        return List.of(
                new SavingAccount(1001, "Krish", 45000, 5000),
                new CurrentAccount(1002, "JD", 55000, 10000),
                new SavingAccount(1003, "Charan", 65000, 6000),
                new CurrentAccount(1004, "CAMS", 75000, 12000),
                new SavingAccount(1005, "Suresh", 85000, 7000),
                new CurrentAccount(1006, "LVRS2N", 95000, 15000),
                new SavingAccount(1007, "Harish", 105000, 8000),
                new CurrentAccount(1008, "CTI", 115000, 18000),
                new SavingAccount(1009, "Ramesh", 125000, 9000)
        );
    }
}
