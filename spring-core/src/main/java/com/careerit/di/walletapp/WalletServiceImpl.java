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
    public Wallet createWallet(Wallet wallet) {
        Optional<Wallet> optWallet = getWalletByMobile(wallet.getMobile());
        if(optWallet.isPresent()){
            throw new RuntimeException("Wallet already exists with mobile number : "+wallet.getMobile());
        }
        wallet.setId(idGenerator.generateId());
        wallets.add(wallet);
        return wallet;
    }

    @Override
    public Optional<Wallet> getWalletByMobile(String mobile) {
        if(!wallets.isEmpty()){
            for(Wallet wallet:wallets){
                if(wallet.getMobile().equals(mobile)){
                    return Optional.of(wallet);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Wallet> getWalletById(String id) {
        if(!wallets.isEmpty()){
            for(Wallet wallet:wallets){
                if(wallet.getId().equals(id)){
                    return Optional.of(wallet);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Wallet> getWallets() {
        return wallets;
    }

}
