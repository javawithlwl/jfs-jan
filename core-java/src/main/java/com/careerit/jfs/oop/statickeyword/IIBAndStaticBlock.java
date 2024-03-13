package com.careerit.jfs.oop.statickeyword;

public class IIBAndStaticBlock {

    {
        System.out.println("IIB called -1 ");
    }

    static {
        System.out.println("Static block called -1 ");
    }

    {
        System.out.println("IIB called -2 ");
    }

    {
        System.out.println("IIB called -3 ");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
        IIBAndStaticBlock obj1 = new IIBAndStaticBlock();

    }
}
