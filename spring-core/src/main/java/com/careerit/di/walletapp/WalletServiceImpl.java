package com.careerit.di.walletapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements  WalletService{

    private List<Wallet> wallets = new ArrayList<>();

    private final IdGenerator idGenerator;
    @Override
    public String createWallet(Wallet wallet) {
        // Generate the id and set it to wallet object; then persist the wallet object to the list
        // With the given mobile number; if wallet already exists then throw exception
        return null;
    }

    @Override
    public Optional<Wallet> getWalletByMobile(String mobile) {
        return Optional.empty();
    }

    @Override
    public Optional<Wallet> getWalletById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Wallet> getWallets() {
        return null;
    }
}
