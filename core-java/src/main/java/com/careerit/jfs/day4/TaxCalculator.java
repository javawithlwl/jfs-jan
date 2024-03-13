package com.careerit.jfs.day4;

public class TaxCalculator {

    // Accept the income and return the tax amount
    // 0 - 3,50,000 -> 0%
    // 3,50,001 - 5,00,000 -> 5%
    // 5,00,001 - 10,00,000 -> 10%
    // 10,00,001 - 20,00,000 -> 20%
    // 20,00,001 - 50,00,000 -> 30%
    // 50,00,001 - above -> 40%

    public static void main(String[] args) {
        double income = 1100000;
        double tax = calculateTax(income);
        System.out.println("For income :"+income+" tax is :"+tax);
    }

    private static double calculateTax(double income) {
        double tax = 0;
        if (income <= 3_50_000) {
            tax = 0;
        } else if (income <= 5_00_000) {
            tax = (income - 3_50_000) * 0.05;
        } else if (income <= 10_00_000) {
            tax = (income - 5_00_000) * 0.1 + 7_500;
        } else if (income <= 20_00_000) {
            tax = (income - 10_00_000) * 0.2 + 7_500 + 50_000;
        } else if (income <= 50_00_000) {
            tax = (income - 20_00_000) * 0.3 + 7_500 + 50_000 + 2_00_000;
        } else {
            tax = (income - 50_00_000) * 0.4 + 7_500 + 50_000 + 2_00_000 + 9_00_000;
        }
        return tax;
    }

}
