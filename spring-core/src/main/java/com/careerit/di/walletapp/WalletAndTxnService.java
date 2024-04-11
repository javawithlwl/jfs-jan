package com.careerit.di.walletapp;

import java.util.List;

public interface WalletAndTxnService {

        Wallet createWallet(Wallet wallet);
        Wallet transferAmount(String fromMobile,String toMobile,double amount);
        List<TransactionDetails> getTransactions(String mobile);
}
