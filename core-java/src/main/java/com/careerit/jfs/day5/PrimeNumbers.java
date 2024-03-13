package com.careerit.jfs.day5;

public class PrimeNumbers {

    // What is prime number?
    // The number which is divisible by 1 and itself is called prime number
    public static void main(String[] args) {
        int lb = 1;
        int ub = 10;
        int count = countPrimes(lb, ub);
        System.out.println("The count of prime numbers in the range " + lb + " to " + ub + " is " + count);
        System.out.println("The prime numbers in the range " + lb + " to " + ub + " is ");
        showPrimes(lb, ub);
        System.out.println("\nThe first 10 prime numbers are ");
        showNPrimes(10);
    }

    // 1 to 10 prime numbers count => 4
    public static int countPrimes(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // 1 to 10 prime numbers => 2,3,5,7
    public static void showPrimes(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // N = 10 => 2,3,5,7,11,13,17,19,23,29
    public static void showNPrimes(int N) {
        int count = 0;
        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            if(count == N) {
                break;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num % 2 == 0 && num != 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
