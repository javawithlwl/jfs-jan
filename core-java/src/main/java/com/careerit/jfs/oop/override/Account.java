package com.careerit.jfs.oop.override;

public abstract sealed class Account permits SavingAccount, CurrentAccount,JointAccount {

        protected int accno;
        protected String name;
        protected double balance;

        public Account(int accno, String name, double balance) {
            this.accno = accno;
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if(amount > balance) {
                System.out.println("Sorry! Insufficient funds");
            }else {
                balance -= amount;
                System.out.println("Amount "+amount+" is withdrawn from account "+accno);
            }
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount "+amount+" is deposited to account "+accno);
        }

        public void showInfo() {
            System.out.println("Account number : "+accno+" Name : "+name+" Balance : "+balance);
        }
}
