package com.careerit.jfs.oop.interfaceexample;

interface Calculator{
    double calculate(double p,double t,double r);
}

class SimpleInterestCalculator implements Calculator{

    @Override
    public double calculate(double p, double t, double r) {
        return (p * t * r) / 100;
    }
}
class EmiCalculator implements Calculator{

    @Override
    public double calculate(double p, double t, double r) {
        r = r / 12 / 100;
        return p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1);
    }
}

public class CalculatorManager {

    public static void main(String[] args) {

            Calculator calc = new SimpleInterestCalculator();
            double si = calc.calculate(100000, 1, 12);
            System.out.println("Si : "+si);
    }
}
