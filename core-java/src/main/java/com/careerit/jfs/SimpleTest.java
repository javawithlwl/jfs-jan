package com.careerit.jfs;

import java.util.List;

public class SimpleTest {

    public static void main(String[] args) {
        List<Double> list = List.of(1.29,1.29,1.29,1.29,1.29,1.29);
        double amount = 0.0;
        for (Double ele : list) {
            amount += ele;
        }
        System.out.println(amount);
    }
}
