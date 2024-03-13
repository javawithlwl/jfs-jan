package com.careerit.jfs.day13;

import java.util.Arrays;

public class PassByValueAndReference {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before increment : " + Arrays.toString(arr));
        increment(arr);
        System.out.println("After increment : " + Arrays.toString(arr));
    }

    private static void increment(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void swap(int num1, int num2) {
        System.out.println("Before swap a :" + num1 + " b :" + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap a :" + num1 + " b :" + num2);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}
