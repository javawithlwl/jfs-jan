package com.careerit.jfs.oop.override;

public final class CurrentAccount extends Account {

        private double overDraft;

        public CurrentAccount(int accno, String name, double balance,double overDraft) {
            super(accno, name, balance);
            this.overDraft = overDraft;
        }

        @Override
        public void withdraw(double amount) {
           if(amount > (balance + overDraft)) {
               System.out.println("Sorry! Insufficient funds");
           }else {
                balance -= amount;
                System.out.println("Amount "+amount+" is withdrawn from account "+accno);
           }
        }
}
