package com.careerit.di.walletapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WalletAndTxnServiceImpl implements WalletAndTxnService{

    private final TransactionService transactionService;
    private final WalletService walletService;
    @Override
    public Wallet createWallet(Wallet wallet) {
        return walletService.createWallet(wallet);
    }

    @Override
    public void transferAmount(String fromMobile, String toMobile, double amount) {
        Optional<Wallet> fromWallet = walletService.getWalletByMobile(fromMobile);
        Optional<Wallet> toWallet = walletService.getWalletByMobile(toMobile);

        if(fromWallet.isPresent() && toWallet.isPresent()) {
            Wallet from = fromWallet.get();
            Wallet to = toWallet.get();
            if (from.getBalance() >= amount) {
                from.setBalance(from.getBalance() - amount);
                to.setBalance(to.getBalance() + amount);
                transactionService.addTransaction(fromMobile, toMobile, amount);
                System.out.println("Amount transferred successfully from : " + fromMobile + " to : " + toMobile);
            } else {
                throw new RuntimeException("Insufficient balance in the wallet : " + fromMobile);
            }
        }else {
            throw new RuntimeException("From or To wallet is not present");
        }
    }

    @Override
    public List<TransactionDetails> getTransactions(String mobile) {
        return transactionService.getAllTransactions(mobile);
    }
}
