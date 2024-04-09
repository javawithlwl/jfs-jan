package com.careerit.di.ex;

import org.springframework.stereotype.Component;

@Component
public class DbConfiguration {

        public String getDbVersion(){
            return "V1.0";
        }
}
