package com.careerit.jfs.day8;

import java.util.Arrays;

public class ArrayExample5 {

    public static void main(String[] args) {

        int[] arr1 = {3, 4, 2, 1, 5, 6};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {1, 2, 3 ,4 ,5 ,6};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1,arr2));

    }
}
