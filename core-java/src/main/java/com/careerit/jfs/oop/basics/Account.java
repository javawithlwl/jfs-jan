package com.careerit.jfs.oop.basics;

public class Account {

        private long accNum;
        private String name;
        private double balance;

        public Account(String name, double balance){
            accNum = System.currentTimeMillis();
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount){
            if(amount > balance) {
                System.out.println("Insufficient funds");
            }else{
                balance -= amount;
                System.out.println("Your account "+DataMaskUtil.maskAccountNumber(accNum)+" has been debited with "+amount+" and balance is "+balance);
            }
        }
        public void deposit(double amount){
            balance += amount;
            System.out.println("Your account "+DataMaskUtil.maskAccountNumber(accNum)+" has been credited with "+amount+" and balance is "+balance);
        }
        public void showBalance(){
            System.out.println("Your account "+DataMaskUtil.maskAccountNumber(accNum)+" has balance of "+balance);
        }

        public void showAccountInfo(){
            String info = "Account Number : "+DataMaskUtil.maskAccountNumber(accNum)+" Name : "+name+" Balance : "+balance;
            System.out.println(info);
        }
}
