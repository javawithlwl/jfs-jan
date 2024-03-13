package com.careerit.jfs.oop.methods;

public class AdvancedInterestCalculator {

    public double calculateHouseEmi(double p, double r, double t) {
        double n = t * 12;
        double emi = (p * r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);
        return emi;
    }

}
