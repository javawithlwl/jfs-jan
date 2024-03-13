package com.careerit.jfs.day12;

public class CallStackExample {

    public void m1() {
        m2();
        System.out.println("m1 method");
    }

    public void m2() {
        m3();
        System.out.println("m2 method");
    }

    public void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {

        CallStackExample obj = new CallStackExample();
        obj.m1();

    }

}
