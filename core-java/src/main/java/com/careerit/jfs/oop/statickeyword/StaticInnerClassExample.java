package com.careerit.jfs.oop.statickeyword;


class Outer{
    static class Inner{
            public static void show(){
                System.out.println("Inner class show method");
            }
    }
}
public class StaticInnerClassExample {

    public static void main(String[] args) {
            Outer.Inner.show();
    }
}
