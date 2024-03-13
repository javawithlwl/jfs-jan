package com.careerit.jfs.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
class Account {
    private long accno;
    private String name;
    private double balance;

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount should be greater than zero");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount should be greater than zero");
        }
        balance += amount;
    }

    public void showInfo() {
        System.out.println("Account number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class AccountService {

    List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void showBalance(long accountNumber) throws AccountNotFoundException, InsufficientFundsException {

    }

}

public class AccountManager {

    public static void main(String[] args) {

        AccountService service = new AccountService();
        try {
            service.showBalance(1001);
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
