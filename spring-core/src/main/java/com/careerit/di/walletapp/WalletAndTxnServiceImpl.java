package com.careerit.di.walletapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WalletAndTxnServiceImpl implements WalletAndTxnService{

    private final TransactionService transactionService;
    @Override
    public Wallet createWallet(Wallet wallet) {
        return null;
    }

    @Override
    public void transferAmount(String fromMobile, String toMobile, double amount) {
        // get the wallet object for fromMobile and toMobile
        // check the balance of fromMobile wallet object
        // if balance is less than amount then throw exception
        // deduct the amount from fromMobile wallet object
        // add the amount to toMobile wallet object
        // add the transaction details to the list

    }

    @Override
    public List<TransactionDetails> getTransactions(String mobile) {
        // check the wallet object for the given mobile number
        // if wallet object is not present then throw exception
        // get all the transactions for the given mobile number
        return null;
    }
}
