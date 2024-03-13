package com.careerit.jfs.oop.methods;

public class Manager {

    public static void main(String[] args) {

            int[] arr = { 10, 20, 30, 40, 110, 60, 70, 80, 90, 100 };
            int max = MethodExample.maxElement(arr);
            System.out.println("Max element in the array is : " + max);
            MethodExample.showGreetings("Krish");
            System.out.println("System date and time : " + MethodExample.getSystemDateTime());
            MethodExample.showSystemInfo();
            int num = 144;
            System.out.println("Square root of "+num+" is : "+Math.sqrt(num));
            MyMathUtil obj = new MyMathUtil();
            obj.showPrimes(10, 100);
            int gcd = obj.gcd(12, 24, 36);
            System.out.println("\nGCD of 12,24,36 is : "+gcd);

            MethodWithRecursion obj1 = new MethodWithRecursion();
            int res = obj1.sumOfNaturalNumbers(10);
            System.out.println("Sum of first 10 natural numbers is : "+res);
            obj1.showTable(19);

            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);

    }
}
