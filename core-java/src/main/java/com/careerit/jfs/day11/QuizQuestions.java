package com.careerit.jfs.day11;

import java.util.List;

public class QuizQuestions {

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Hello World";

        String s3 = new String("Hello World");
        String s4 = new String("Hello World");


        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        String st1 = "Core Java";
        String st2 = "Core";
        String st3 = " Java";
        String st4 = st2 + st3;
        System.out.println(st1 == st4);

        String data = "Java world";
        System.out.println(data.substring(0, 4));
        System.out.println(data.substring(4).toUpperCase().trim().substring(0, 2));
    }

    public static String rotateString(String str,int n){
       // Hello -> 3 -> loHel
        // Hello -> 2 -> lloHe
        // Hello -> 1 -> elloH
        return "";
    }

    public static String countPalindromeString(List<String> list) {
        return "";
    }

    // find the unique names from the list and return as a comma separated string; if list is empty return empty string
    public static String findUniqueNames(List<String> list) {
        return "";
    }
}
