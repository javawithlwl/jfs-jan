package com.careerit.di.walletapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Scanner;

@ComponentScan(basePackages = "com.careerit.di.walletapp")
public class WalletManager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(WalletManager.class);
        WalletAndTxnService service = context.getBean(WalletAndTxnService.class);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create Wallet");
            System.out.println("2. Transfer Amount");
            System.out.println("3. Get Transactions");
            System.out.println("4. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        System.out.println("Enter the name:");
                        String name = sc.next();
                        System.out.println("Enter the mobile:");
                        String mobile = sc.next();
                        System.out.println("Enter the amount:");
                        double amount = sc.nextDouble();
                        Wallet wallet = new Wallet();
                        wallet.setMobile(mobile);
                        wallet.setName(name);
                        wallet.setBalance(amount);
                        Wallet createdWallet = service.createWallet(wallet);
                        System.out.println("Wallet created successfully with id: " + createdWallet.getId());
                        break;
                    } catch (Exception e) {
                        System.out.println("While creating wallet: " + e.getMessage());
                    }
                case 2:
                    try {
                        System.out.println("Enter the from mobile:");
                        String fromMobile = sc.next();
                        System.out.println("Enter the to mobile:");
                        String toMobile = sc.next();
                        System.out.println("Enter the amount:");
                        double amount = sc.nextDouble();
                        service.transferAmount(fromMobile, toMobile, amount);
                        break;
                    } catch (Exception e) {
                        System.out.println("While transferring amount: " + e.getMessage());
                    }
                case 3:
                    try {
                        System.out.println("Enter the mobile:");
                        String mobile1 = sc.next();
                        List<TransactionDetails> list = service.getTransactions(mobile1);
                        if(list.isEmpty()) {
                            System.out.println("No transactions found for the given mobile number");
                        }else {
                            list.forEach(ele -> {
                                String txnType = "CREDIT";
                                if(ele.getFromMobile().equals(mobile1)) {
                                    txnType = "DEBIT";
                                }
                                String data = String.format("Transaction Id: %s, From: %s, To: %s, Amount: %s, Type: %s, Date: %s", ele.getTransactionId(), ele.getFromMobile(), ele.getToMobile(), ele.getAmount(), txnType, ele.getDate());
                                System.out.println(data);
                            });
                        }
                        break;
                    }catch (Exception e) {
                        System.out.println("While getting transactions: " + e.getMessage());
                    }
                case 4:
                    System.exit(0);
            }

        }

    }
}
