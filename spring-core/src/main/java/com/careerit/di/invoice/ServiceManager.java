package com.careerit.di.invoice;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceManager {


        public List<ServiceDetails> getActiveServices(){
            return List.of(
                ServiceDetails.builder().id(1001).name("Netflex").amount(200).build(),
                ServiceDetails.builder().id(1002).name("Hostar").amount(100).build(),
                ServiceDetails.builder().id(1003).name("Zee").amount(30).build(),
                ServiceDetails.builder().id(1004).name("Jio").amount(40).build(),
                ServiceDetails.builder().id(1005).name("Etv").amount(15).build()
            );
        }

}
