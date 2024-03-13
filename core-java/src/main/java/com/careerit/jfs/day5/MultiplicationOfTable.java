package com.careerit.jfs.day5;

public class MultiplicationOfTable {

    public static void main(String[] args) {
        int num = 19;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        System.out.println("---------------------------------------------------");
        for(int i = 10; i >= 1; i--) {
        	System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}

// Shortcuts: Delete line : CMD + backspace
//            To move line up : CMD + shift + up
//            To move line down : CMD + shift + down
//            To duplicate line : CMD + D
