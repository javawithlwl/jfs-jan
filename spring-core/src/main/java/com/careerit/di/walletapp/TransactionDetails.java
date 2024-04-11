package com.careerit.di.walletapp;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionDetails {

        private String fromMobile;
        private String toMobile;
        private double amount;
        private String transactionId;
        private LocalDate date;

}
