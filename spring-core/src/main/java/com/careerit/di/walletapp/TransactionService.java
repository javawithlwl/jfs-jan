package com.careerit.di.walletapp;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

        private List<TransactionDetails> transactions = new ArrayList<>();

        public TransactionDetails addTransaction(String fromMobile,String toMobile, double amount) {
              // Implement the logic to add the transaction
                return null;
        }
        public List<TransactionDetails> getAllTransactions(String mobile) {
                // Implement the logic to get all transactions for the given mobile number
                return transactions;
        }
}
