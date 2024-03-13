package com.careerit.jfs.oop.methods;

public class MyMathUtil {


    public int biggestOf(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int sumOfNaturalNumbers(int n) {
        return (n * n + 1) / 2;
    }

    public void showPrimes(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    private int gcd(int a, int b) {
        while(a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num % 2 == 0 && num != 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
