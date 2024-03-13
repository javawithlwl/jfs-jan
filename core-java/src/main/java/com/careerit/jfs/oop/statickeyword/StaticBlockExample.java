package com.careerit.jfs.oop.statickeyword;

public class StaticBlockExample {

    static {
        System.out.println("Static block called -1 ");
    }

    static {
        System.out.println("Static block called -3 ");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
    }

    static{
        System.out.println("Static block called -2 ");
    }

    // static block is called only once when the class is loaded into the memory
    // static block is used to initialize the static members of the class
    // static block is called in the order they are defined in the class
    // static block cannot be called explicitly
}
