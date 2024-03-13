package com.careerit.jfs.day5;

public class BreakAndContinue {


    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if(i % 6 == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------");

        for (int i = 1; i <= 20; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }




    }
}
