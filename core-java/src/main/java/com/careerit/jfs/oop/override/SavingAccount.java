package com.careerit.jfs.oop.override;

public final class SavingAccount extends Account {

        private double minBalance;

        public SavingAccount(int accno, String name, double balance,double minBalance) {
            super(accno, name, balance);
            this.minBalance = minBalance;
        }

        @Override
        public void withdraw(double amount) {
           if(amount > (balance - minBalance)) {
               System.out.println("Sorry! Insufficient funds");
           }else {
                balance -= amount;
                System.out.println("Amount "+amount+" is withdrawn from account "+accno);
           }
        }
}
