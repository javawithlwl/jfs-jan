package com.careerit.jfs.oop.inheritance;

class C1{
    public void show1(){
        System.out.println("Show1 C1");
    }
}
class C2 extends  C1{

    @Override
    public void show1(){
        System.out.println("Show1 C2");
    }
    public void show2(){
        System.out.println("Show2 C2");
    }
}
public class TypeCastingClass {

    public static void main(String[] args) {

            C1 obj = new C2();
            if(obj instanceof C2 obj2) {
                obj2.show1();
                obj2.show2();
            }
    }
}
