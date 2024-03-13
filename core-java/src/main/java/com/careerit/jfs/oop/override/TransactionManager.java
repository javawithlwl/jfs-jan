package com.careerit.jfs.oop.override;

import java.time.LocalDateTime;

public class TransactionManager {

    public static void main(String[] args) {

        Transaction t1 = new Transaction(1001, "9876543210", "9876543211", 1000, TxnStatus.SUCCESS, LocalDateTime.now());
        Transaction t2 = new Transaction(1002, "9876543210", "9876543211", 1000, TxnStatus.SUCCESS, LocalDateTime.now().minusHours(1));
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("---------------------------------------------------");
        System.out.println("Transaction details");
        System.out.println("Txn id :"+t1.getTransId());
        System.out.println("From mobile: "+t1.getFromMobile());
        System.out.println("To mobile: "+t1.getToMobile());
        System.out.println("Amount: "+t1.getAmount());
        System.out.println("Status: "+t1.getStatus());
        System.out.println("Date and time: "+t1.getDateTime());
        System.out.println("---------------------------------------------------");
        System.out.println("Transaction details");
        System.out.println("Txn id"+t2.getTransId());
        System.out.println("From mobile: "+t2.getFromMobile());
        System.out.println("To mobile: "+t2.getToMobile());
        System.out.println("Amount: "+t2.getAmount());
        System.out.println("Status: "+t2.getStatus());
        System.out.println("Date and time: "+t2.getDateTime());
        System.out.println("---------------------------------------------------");
    }
}
