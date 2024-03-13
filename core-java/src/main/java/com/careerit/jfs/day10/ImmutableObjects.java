package com.careerit.jfs.day10;

public class ImmutableObjects {

    public static void main(String[] args) {

        String name1 = "Krish";
        String name2 = "Krish";

        System.out.println(name1.concat("na"));
        System.out.println(name1);
        System.out.println(name2);

        String s1 = "Core";
        String s2 = "Core Java";
        String s3 = s1.concat(" Java");
        String s4 = s1 + " Java";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);

    }
}
