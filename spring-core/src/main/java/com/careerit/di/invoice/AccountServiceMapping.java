package com.careerit.di.invoice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AccountServiceMapping {

        private final ServiceManager serviceManager;
        private final AccountManager accountManager;

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
