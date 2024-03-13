package com.careerit.jfs.collections;

import java.util.function.*;

public class LambdaExample {


    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Consumer<String> consumer1 = s -> System.out.println(s);
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };
        Predicate<String> predicate1 = s -> s.length() > 5;

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Function<String,Integer> function1 = s->s.length();
        BiFunction<String, String, String> biFunction = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s + s2;
            }
        };
        BiFunction<String,String,String> biFunction1 = (s1,s2)->s1+s2;
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        };

        UnaryOperator<String> unaryOperator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        MyMathOperation<Integer> add = new MyMathOperation<Integer>() {
            @Override
            public Integer operation(Integer a, Integer b) {
                return  a + b;
            }
        };
        MyMathOperation<Integer> sub = new MyMathOperation<Integer>() {
            @Override
            public Integer operation(Integer a, Integer b) {
                return  a - b;
            }
        };

    }

}
interface MyMathOperation<T> {
    T operation(T a, T b);
}
