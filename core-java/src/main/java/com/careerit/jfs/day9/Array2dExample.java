package com.careerit.jfs.day9;

public class Array2dExample {

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Using for each loop");
        for(int[] subArr:arr) {
           for(int ele:subArr) {
               System.out.print(ele+" ");
           }
            System.out.println();
        }
    }
}
