package com.careerit.jfs.oop.methods;

public final class InterestCalculator {

    public final double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public final double calculateCompoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }
    public final double calculateEmi(double p, double r, double t) {
        double n = t * 12;
        double emi = (p * r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1);
        return emi;
    }
  
}