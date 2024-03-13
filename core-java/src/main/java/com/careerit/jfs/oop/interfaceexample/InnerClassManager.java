package com.careerit.jfs.oop.interfaceexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@FunctionalInterface
interface MathOperation{
    int perform(int a,int b);
}

// Functional interface - interface with only one abstract method


class IntegerMathOperations{
    private MathOperation mathOperation ;

    public IntegerMathOperations(MathOperation mathOperation){
        this.mathOperation = mathOperation;
    }
    public int performOperation(int a,int b){
        return mathOperation.perform(a, b);
    }

}

interface TestCondition{
    boolean test(int a);
}
interface ArithmeticOperation{
    int perform(int a,int b,int c);
}
public class InnerClassManager {

    public static void main(String[] args) {

        MathOperation obj1 = (num1, num2)-> num1 + num2;
        IntegerMathOperations intMathOperations = new IntegerMathOperations(obj1);
        int res = intMathOperations.performOperation(10, 20);
        System.out.println("Result : "+res);

        TestCondition testCondition = (a)-> a % 2 == 0;
        ArithmeticOperation arithmeticOperation = (num1,num2,num3)-> Math.max(num1,Math.max(num2,num3));

        List<String> flist = filterNames(List.of("Krish","Anusha","Anshuman","Anish","Yaswanth","Byaswanth"),(s)-> s.contains("a"));
        System.out.println(flist);

    }

    private static List<String> filterNames(List<String> list, Predicate<String> predicate){
        List<String> flist = new ArrayList<>();
        for(String name:list){
            if(predicate.test(name)){
                flist.add(name);
            }
        }
        return flist;
    }
}
