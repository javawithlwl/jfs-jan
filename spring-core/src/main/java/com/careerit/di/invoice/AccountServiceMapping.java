package com.careerit.di.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AccountServiceMapping {
        @Autowired
        private ServiceManager serviceManager;
        @Autowired
        private AccountManager accountManager;
        public Map<AccountInfo, List<ServiceDetails>> getAccountWithServices(){
            Map<AccountInfo,List<ServiceDetails>> map =  new HashMap<>();
            List<AccountInfo> accountInfos = accountManager.getActiveAccounts();
            int i = 2;
            for (AccountInfo accountInfo : accountInfos) {
                map.put(accountInfo, getServices(i++));
            }
            return map;
        }

        private List<ServiceDetails> getServices(int num){
          List<ServiceDetails> serviceDetails = serviceManager.getActiveServices();
            if(num > serviceDetails.size()){
               return serviceDetails;
            }
            return serviceDetails.subList(0, num);
        }
}
