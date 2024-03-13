package com.careerit.jfs.day8;

import java.util.Arrays;

public class ArrayExample4 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        boolean res = isPalindrome(arr1);
        System.out.println(Arrays.toString(arr1) + " is palindrome ? " + res);
        int[] arr2 = {1, 2, 3, 4, 5};
        res = isPalindrome(arr2);
        System.out.println(Arrays.toString(arr2) + " is palindrome ? " + res);
    }

    // if arr is palindrome return true else return false
    // [1,2,3,2,1] -> true
    // [1,2,3,4,5] -> false
    public static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
