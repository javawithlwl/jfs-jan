package com.careerit.junit5;

public class MathUtil {


    public int biggest(int a, int b, int c) {
           return Math.max(a, Math.max(b, c));
    }

    public int biggest(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array should not be empty or null");
        }
        int max = arr[0];
        for(int ele:arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }

    public boolean palindrome(int num){
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
        }
        return rev == num;
    }
}
