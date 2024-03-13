package com.careerit.jfs.day7;

public class NumberCommonQuestions {

    public static void main(String[] args) {
        int num1 = 1221;
        System.out.println("The sum of digits of " + num1 + " is " + sumOfDigits(num1));
        System.out.println("The reverse of " + num1 + " is " + reverseOfNumber(num1));
        System.out.println("Is " + num1 + " is palindrome :" + isPalindrome(num1));
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            int r = num % 10;
            sum += r;
            num /= 10;
        }
        return sum;
    }

    public static int reverseOfNumber(int num){
        int rev = 0;
        while(num != 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num){
        return num == reverseOfNumber(num);
    }

    public static int sumOfDigitsUntilSingleDigit(int num){
        return 0;
    }

    public static boolean isArmstrong(int num){
        return false;
    }

    public static int primeDigitsCount(int num){
        return 0;
    }


}
