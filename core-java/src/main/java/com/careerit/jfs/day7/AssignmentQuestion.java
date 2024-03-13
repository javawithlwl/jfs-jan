package com.careerit.jfs.day7;

public class AssignmentQuestion {

    public static void main(String[] args) {
        int day = 5;
        double billAmount = 10000;
        double discount = calDiscount(billAmount, day);
        double netAmount = billAmount - discount;
        System.out.println("Bill Amount : "+billAmount);
        System.out.println("Discount    : "+discount);
        System.out.println("Net Amount  : "+netAmount);
    }

    public static double calDiscount(double amount, int day){
        // if day is Mon discount is 25%
        // if day is Tue discount is 20%
        // if day is Wed discount is 15%
        // if day is Thu,Fri discount is 10%
        // if day is Sat,Sun discount is 5%
        // if day is invalid discount is 0%


        return 0;

    }

}
