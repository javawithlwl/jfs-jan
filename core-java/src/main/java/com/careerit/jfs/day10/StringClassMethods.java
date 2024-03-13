package com.careerit.jfs.day10;

public class StringClassMethods {

    public static void main(String[] args) {

        String name = " Krish T ";
        name = name.trim();
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name);
        String names = "Krish,Manoj,Charan,Rajesh,Jayesh";
        String[] arr = names.split(",");
        for (String ele : arr) {
            System.out.println(ele.substring(0, 3).toUpperCase());
        }
        String s1 = "Core Java";
        System.out.println(s1.substring(0, 4));
        System.out.println(s1.substring(4).trim());
    }
}
