package com.careerit.jfs.day3;

public class DefaultValues {

        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        boolean flag;
        char ch;
        String name;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();
        System.out.println("Byte value is :"+obj.b);
        System.out.println("Short value is :"+obj.s);
        System.out.println("Int value is :"+obj.i);
        System.out.println("Long value is :"+obj.l);
        System.out.println("Float value is :"+obj.f);
        System.out.println("Double value is :"+obj.d);
        System.out.println("Boolean value is :"+obj.flag);
        System.out.println("Char value is :"+obj.ch);
        System.out.println("String value is :"+obj.name);

    }
}
