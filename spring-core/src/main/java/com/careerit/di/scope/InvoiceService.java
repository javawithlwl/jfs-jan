package com.careerit.di.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final AccountDao accountDao;

    public void showInvoiceDetails(){
        System.out.println("Account dao : "+accountDao);
        System.out.println("Account Info : "+accountDao.getAccountInfo());
    }
}
