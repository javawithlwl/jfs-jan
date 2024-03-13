package com.careerit.jfs.day5;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
        int N = 10;
        int sum = sumOfFirstNNumbers(N);
        System.out.println("The sum of first " + N + " natural numbers is " + sum);
        int evenSum = sumOfFirstNEvenNumbers(N);
        System.out.println("The sum of first " + N + " even numbers is " + evenSum);
        int oddSum = sumOfFirstNOddNumbers(N);
        System.out.println("The sum of first " + N + " odd numbers is " + oddSum);
    }

    public static int sumOfFirstNNumbers(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += i;
        }
       return sum;
    }
    public static int sumOfFirstNEvenNumbers(int N) {
        int evenSum = 0;
        for(int i = 1; i <= N; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }
    public static int sumOfFirstNOddNumbers(int N) {
        int oddSum = 0;
        for(int i = 1; i <= N; i++) {
            if(i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }
}
