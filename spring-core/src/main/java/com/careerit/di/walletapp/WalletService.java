package com.careerit.di.walletapp;

import java.util.List;
import java.util.Optional;

public interface WalletService {

        public Wallet createWallet(Wallet wallet);
        public Optional<Wallet> getWalletByMobile(String mobile);
        public Optional<Wallet> getWalletById(String id);
        public List<Wallet> getWallets();
}
