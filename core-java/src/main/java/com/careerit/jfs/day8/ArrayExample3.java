package com.careerit.jfs.day8;

public class ArrayExample3 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 , 6, 7, 8, 9};
        boolean res = isAllElementPresent(arr, 3, 2, 4);
        System.out.println(res);
        res = isAllElementPresent(arr, 1,2,10);
        System.out.println(res);

    }

    // If all elements are present return true else return false
    public static boolean isAllElementPresent(int[] arr,int ele1,int ele2, int ele3){
        return false;
    }
    // If element is present return true else return false
    private static boolean isPresent(int[] arr,int ele){
        return false;
    }

    private static int biggestElement(int[] arr){
        return 0;
    }
    private static int smallestElement(int[] arr){
        return 0;
    }
    private static int[] getPrimeNumbers(int[] arr){
        return null;
    }
    private static int[] divisibleBy(int[] arr,int num){
        return null;
    }
    private static int[] getFirstNElements(int[] arr,int n){
        return null;
    }
    private static int[] getLastNElements(int[] arr,int n){
        return null;
    }
}
