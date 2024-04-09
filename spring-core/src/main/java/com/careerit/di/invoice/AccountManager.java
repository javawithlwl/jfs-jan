package com.careerit.di.invoice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountManager {


        public List<AccountInfo> getActiveAccounts(){

            return List.of(
                AccountInfo.builder().accountNumber(1001).name("Krish").city("Hyd").build(),
                AccountInfo.builder().accountNumber(1002).name("Manoj").city("Bang").build(),
                AccountInfo.builder().accountNumber(1003).name("Charan").city("Hyd").build(),
                AccountInfo.builder().accountNumber(1004).name("Rajesh").city("Hyd").build(),
                AccountInfo.builder().accountNumber(1005).name("Suresh").city("Bang").build()
            );
        }
}
