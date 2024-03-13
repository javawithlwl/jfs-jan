package com.careerit.jfs.day10;

public class StringObjectCreation {

    public static void main(String[] args) {

        String name1 = "Krish";
        String name2 = new String("Krish");
        String name3 = new String(new char[]{'K', 'r', 'i', 's', 'h'});

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
