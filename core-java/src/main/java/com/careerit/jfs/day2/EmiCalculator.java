package com.careerit.jfs.day2;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal Loan Amount :");
        double P = sc.nextDouble();

        System.out.println("Enter the Rate Interest : ");
        double ri = sc.nextDouble();

        System.out.println("Enter the Duration in months: ");
        double n = sc.nextDouble();
        
        // ri is rate of interest calculated on monthly basis. (i.e., ri = Rate of Annual interest/12/100. If rate of interest is 10.5% per annum, then r = 10.5/12/100=0.00875)       
        
        double r = ri / 12 / 100;

        double emi = P * r * (Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1));

        double totalAmount = emi * n;
        double totalInterest = totalAmount - P;

        System.out.println("Principal Amount     :"+P);
        System.out.println("Rate of interest     :"+ri+"%");
        System.out.println("Duration in (Months) :"+n);
        System.out.println("----------------------------------");
        System.out.println("Emi amount     :"+Math.round(emi));
        System.out.println("Total Interest :"+Math.round(totalInterest));
        System.out.println("Total Amount   :"+Math.round(totalAmount));


    }
}
