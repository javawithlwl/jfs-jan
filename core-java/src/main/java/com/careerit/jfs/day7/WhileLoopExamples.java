package com.careerit.jfs.day7;

public class WhileLoopExamples {

    public static void main(String[] args) {
        int num1 = 19;
        showTable(num1);
        int num2 = 5;
        int res = factorial(num2);
        System.out.println("The factorial of " + num2 + " is " + res);
    }
    public static void showTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
    public static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        int res = 1;
        int i = 2;
        while(i <= num){
            res *= i;
            i++;
        }
        return res;
    }
}


