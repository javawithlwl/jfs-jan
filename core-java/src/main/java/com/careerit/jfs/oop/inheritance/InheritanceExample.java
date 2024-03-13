package com.careerit.jfs.oop.inheritance;

class One {
    public void show1() {
        System.out.println("Show1 method called");
    }
}

class Two extends One{
    public void show2() {
        System.out.println("Show2 method called");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Two obj = new Two();
        obj.show1();
        obj.show2();
    }
}
