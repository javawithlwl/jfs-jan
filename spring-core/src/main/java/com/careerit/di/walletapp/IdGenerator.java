package com.careerit.di.walletapp;


import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class IdGenerator {
        public String generateId(){
            int year = LocalDate.now().getYear();
            String str = (""+System.currentTimeMillis()).substring(5);
            return  year +"-" +str.substring(0,4)+"-"+str.substring(4);
        }

}
