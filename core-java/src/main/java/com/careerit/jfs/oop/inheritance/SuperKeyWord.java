package com.careerit.jfs.oop.inheritance;

class Cls1{
    int a = 10;
    public Cls1(){
        System.out.println("1");
    }
    void show(){
        System.out.println("1 - show");
    }
}
class Cls2 extends Cls1{
    int a = 100;
    public Cls2(){
        System.out.println("2");
    }
    void show(){
        System.out.println("2 - show");
        System.out.println(a);
    }

}
class Cls3 extends Cls2{
    int a = 1000;
    public Cls3(){
        System.out.println("3");
    }
    void show(){
        System.out.println("3 - show");
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class SuperKeyWord {

    public static void main(String[] args) {

            Cls1 obj = new Cls3();
            obj.show();
            System.out.println(obj.a);

    }
}
