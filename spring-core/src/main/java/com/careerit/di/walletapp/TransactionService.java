package com.careerit.di.walletapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private List<TransactionDetails> transactions = new ArrayList<>();

    public TransactionDetails addTransaction(String fromMobile, String toMobile, double amount) {
        TransactionDetails transaction = new TransactionDetails();
        transaction.setFromMobile(fromMobile);
        transaction.setToMobile(toMobile);
        transaction.setAmount(amount);
        transaction.setTransactionId("" + System.currentTimeMillis());
        transaction.setDate(java.time.LocalDate.now());
        transactions.add(transaction);
        return transaction;
    }

    public List<TransactionDetails> getAllTransactions(String mobile) {
        List<TransactionDetails> list = new ArrayList<>();
        for (TransactionDetails transaction : transactions) {
            if (transaction.getFromMobile().equals(mobile) || transaction.getToMobile().equals(mobile)) {
                list.add(transaction);
            }
        }
        return list;
    }
}
