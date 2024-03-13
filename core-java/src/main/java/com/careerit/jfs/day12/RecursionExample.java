package com.careerit.jfs.day12;

public class RecursionExample {


    public int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

    public int gcd(int a, int b, int c) {
        return gcd(a, gcd(b,c));
    }

    public static void main(String[] args) {
        RecursionExample obj = new RecursionExample();
        System.out.println(obj.factorial(5));
        System.out.println(obj.gcd(12, 15));
        int res = obj.gcd(12,15,18  );

    }
}
