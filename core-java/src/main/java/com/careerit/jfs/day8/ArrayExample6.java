package com.careerit.jfs.day8;

import java.util.Arrays;

public class ArrayExample6 {

    public static void main(String[] args) {

        String s1 = "CAT";
        String s2 = "ACT";
        String s3 = "BAT";
        System.out.println(s1 + " and " + s2 + " are anagram ? " + isAnagram(s1, s2));
        System.out.println(s1 + " and " + s3 + " are anagram ? " + isAnagram(s1, s3));
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
