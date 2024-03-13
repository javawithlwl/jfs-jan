package com.careerit.jfs.day9;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        int[] arr2 = new int[]{15, 11, 12, 13, 14};
        int[] arr3 = mergeArrays(arr1, arr2);
        System.out.println("Merged array is : "+ Arrays.toString(arr3));

    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        return arr3;
    }


}
