package com.careerit.jfs.oop.interfaceexample;

interface C1{
    void m1();
}
interface C2{
    void m1();
    void m2();
}
interface C3 extends C1,C2{
    void m3();
}
class C4 implements C3 {

    @Override
    public void m1() {
        System.out.println("M1 method");
    }

    @Override
    public void m2() {
        System.out.println("M2 method");
    }

    @Override
    public void m3() {
        System.out.println("M3 method");
    }
}

public class InterfaceWithMultipleInheritance {

    public static void main(String[] args) {

            C1 obj = new C4();
            obj.m1();
    }
}
