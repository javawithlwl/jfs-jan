package com.careerit.jfs.day11;

public class StringBuilderExample2 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }

    public static boolean isPalindrome(String str) {
       /* String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return str.equals(revStr);*/

        /*for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;*/

        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
