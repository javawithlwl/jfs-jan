package com.careerit.di.scope;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class AccountDao {

        public String getAccountInfo(){
            return "Account number: 1234567890, Balance: 10000.00";
        }
}
