package com.careerit.jfs.oop.typecasting;

public class TypeCastingExample {

    public static void main(String[] args) {

        int a = 10;
        double b = a; // Implicit type casting
        System.out.println(b);
        double c = 10.5;
        int d = (int) c;
        System.out.println(d);

        // Type casting
        // 1. Implicit type casting (Widening)
        // 2. Explicit type casting (Narrowing)

        String str = "2345.50";
        double num  = Double.parseDouble(str);
        System.out.println(num);


        // byte, short, int, long, float, double, char, boolean
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean

        // boxing and unboxing

        int x = 10;
        Integer obj = x; // boxing
        int y = obj; // unboxing
    }
}
