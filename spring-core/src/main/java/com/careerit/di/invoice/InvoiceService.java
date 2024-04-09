package com.careerit.di.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class InvoiceService {
    @Autowired
    private AccountServiceMapping accountServiceMapping;
    public void showInvoiceAmountForAllAccounts(){

        Map<AccountInfo, List<ServiceDetails>> map = accountServiceMapping.getAccountWithServices();

        for (Map.Entry<AccountInfo, List<ServiceDetails>> entry : map.entrySet()) {
            AccountInfo accountInfo = entry.getKey();
            List<ServiceDetails> serviceDetails = entry.getValue();
            double totalAmount = serviceDetails.stream().mapToDouble(ServiceDetails::getAmount).sum();
            System.out.println("Dear "+accountInfo.getName()+
                    ", total "+ serviceDetails.size()+
                    " services are subscribed for the account number : "+
                    accountInfo.getAccountNumber()+" and the total amount is : "+totalAmount+".");
            System.out.println("More Details : ");
            serviceDetails.forEach(System.out::println);
            System.out.println("---------------------------------------------------");
        }
    }
}


//Dear {}, total {} services are subscribed for the account number : {} and the total amount is : {}.