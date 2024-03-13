package com.careerit.jfs.oop.interfaceexample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

interface MathQuestions {
    int gcd(int a, int b);

    boolean isPrime(int num);

    int factorial(int num);

    default int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    default List<Integer> primeNumber(int lb, int ub) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    default List<Integer> evenNumbers(int lb, int ub) {
        List<Integer> evenList = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (isEven(i)) {
                evenList.add(i);
            }
        }
        return evenList;
    }

    public static void showSystemInfo() {
        System.out.println("OS : " + System.getProperty("os.name"));
        System.out.println("Java Version : " + System.getProperty("java.version"));
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

}

class MathQuestionsImpl implements MathQuestions {

    @Override
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}

class MyNewMathQuestionsImpl implements MathQuestions {

    @Override
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int factorial(int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}

@FunctionalInterface
interface One {
    void m1();

    default void m2() {
        System.out.println("M2 method");
    }
}

@FunctionalInterface
interface Two {
    void m1();

    default void m3() {
        System.out.println("M3 method");
    }

    private void m4() {
        System.out.println("M4 method");
    }
}

// Marker interface : interface without any methods
interface Three {

}
public class MyInterfaceDemo implements Serializable {
}
