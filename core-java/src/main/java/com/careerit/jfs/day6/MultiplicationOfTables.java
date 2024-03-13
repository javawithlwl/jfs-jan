package com.careerit.jfs.day6;

public class MultiplicationOfTables {

    public static void main(String[] args) {
        int lb = 1;
        int ub = 20;
        showTable(lb, ub);
    }

    public static void showTable(int lb, int ub) {
        for (int j = lb; j <= ub; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + " * " + i + " = " + j * i);
            }
            System.out.println("---------------------------------------------------");
        }

    }
}
