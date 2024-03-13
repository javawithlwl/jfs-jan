package com.careerit.jfs.builder;

import lombok.Builder;

import java.time.LocalDate;

@Builder
class Statement{
    private LocalDate from;
    private LocalDate to;
    private Account account;
    private Address address;
    private Transaction transaction;
    private BalanceDetails balanceDetails;
    private LoanDetails loanDetails;
/*
    public Statement(StatementBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.account = builder.account;
        this.address = builder.address;
        this.transaction = builder.transaction;
        this.balanceDetails = builder.balanceDetails;
        this.loanDetails = builder.loanDetails;
    }
    public static StatementBuilder builder() {
        return new StatementBuilder();
    }

    public static class StatementBuilder{
        private LocalDate from;
        private LocalDate to;
        private Account account;
        private Address address;
        private Transaction transaction;
        private BalanceDetails balanceDetails;
        private LoanDetails loanDetails;

        public StatementBuilder from(LocalDate from) {
            this.from = from;
            return this;
        }
        public StatementBuilder to(LocalDate to) {
            this.to = to;
            return this;
        }
        public StatementBuilder account(Account account) {
            this.account = account;
            return this;
        }
        public StatementBuilder address(Address address) {
            this.address = address;
            return this;
        }
        public StatementBuilder transaction(Transaction transaction) {
            this.transaction = transaction;
            return this;
        }
        public StatementBuilder balanceDetails(BalanceDetails balanceDetails) {
            this.balanceDetails = balanceDetails;
            return this;
        }
        public StatementBuilder loanDetails(LoanDetails loanDetails) {
            this.loanDetails = loanDetails;
            return this;
        }
        public Statement build() {
            return new Statement(this);
        }
    }*/

}
class Account{
    private String accNo;
    private String name;
}
class Address{
    private String city;
    private String state;
}
class Transaction{
    private String txnId;
    private String description;
    private double amount;
}
class BalanceDetails{
    private double openingBalance;
    private double closingBalance;
}
class LoanDetails{
    private double loanAmount;
    private double emi;
    private int remainingEmi;
}


public class BuilderExample {

    public static void main(String[] args) {

            Statement statement = Statement.builder()
                    .from(LocalDate.now())
                    .to(LocalDate.now().plusDays(30))
                    .account(new Account())
                    .address(new Address())
                    .transaction(new Transaction())
                    .balanceDetails(new BalanceDetails())
                    .build();

    }
}
