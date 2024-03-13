package com.careerit.jfs.day11;

public class StringMutableObjects {

    public static void main(String[] args) {

        String empno = "1001";
        String name = "Krish";
        String salary = "100000";
        String location = "Hyderabad";

        StringBuilder sb = new StringBuilder();
        sb.append(empno).
                append(",").
                append(name).
                append(",").
                append(salary).
                append(",").
                append(location);
        System.out.println(sb.toString());
    }
}
