package com.careerit.jfs.day6;

public class AssignmentQuestions {

    public static void main(String[] args) {
        int requiredBoxes = numberOfBoxesRequired(108, 10);
        System.out.println("Number of boxes required :"+requiredBoxes);
        requiredBoxes = numberOfBoxesRequired(100, 10);
        System.out.println("Number of boxes required :"+requiredBoxes);
        printAllPrimeFactors(35);
        printAllPrimeFactors(54);
        fibonacciSeries(5);
        fibonacciSeries(10);
        double sum = sumOfSeries(5);
        System.out.println("Sum of series :"+sum);

    }
    // Total items = 108 and items per box = 10 then number of boxes required is 11
    // Total items = 100 and items per box = 10 then number of boxes required is 10
    public static int numberOfBoxesRequired(int totalItems,int itemsPerBox){
        //TODO : Implement logic here
        return 0;
    }

    // num is 35 then output should be 5 7
    // num is 54 then output should be 2
    public static void printAllPrimeFactors(int num){
        //TODO : Implement logic here
    }

    public static boolean isPrime(int num){
        //TODO : Implement logic here
        return false;
    }
    // num is 5 then output should be 0 1 1 2 3
    // num is 10 then output should be 0 1 1 2 3 5 8 13 21 34
    public static void fibonacciSeries(int num){
        //TODO : Implement logic here
    }
    // The sum of series 1 + 1/2! + 1/3! + 1/4! + 1/5! + ... + 1/N!
    // num is 5 then output should be 2.708333333333333
    public static double sumOfSeries(int num){
        //TODO : Implement logic here
        return 0;
    }
    public static double factorial(int num){
        //TODO : Implement logic here
        return 0;
    }
    // use for loop to calculate power of given number
    public static double power(int num,int pow){
        //TODO : Implement logic here
        return 0;
    }


}
