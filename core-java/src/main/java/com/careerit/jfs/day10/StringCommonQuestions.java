package com.careerit.jfs.day10;

import java.util.Arrays;

public class StringCommonQuestions {

    public static void main(String[] args) {

        String name1 = "CAT";
        String name2 = "ACT";
        String name3 = "BAT";
        System.out.println(isAnagram(name1, name2));
        System.out.println(isAnagram(name1, name3));
        System.out.println(isPalindrome("MADAM"));
        System.out.println(isPalindrome("MADAMS"));
        System.out.println(countOfWords(
                new String[] { "Java", "is", "Java", "is", "Java" },
                "Java"));
        System.out.println(countOfWords(
                new String[] { "Java", "is", "Java", "is", "Java" },
                ".Net"));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static int countOfWords(String[] arr, String key) {
        int count = 0;
        for (String ele : arr) {
            if (ele.equals(key)) {
                count++;
            }
        }
        return count;
    }

}
