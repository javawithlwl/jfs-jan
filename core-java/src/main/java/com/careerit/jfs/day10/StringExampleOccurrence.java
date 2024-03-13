package com.careerit.jfs.day10;

import java.util.Arrays;

public class StringExampleOccurrence {
    public static void main(String[] args) {

        String data = "Java is a programming language and Java is a platform you can learn Java in fun way and Java is a popular language";
        String key = "Java";

        String[] arr = data.split(" ");
        int count = 0;
        for (String ele : arr) {
            if (ele.equals(key)) {
                count++;
            }
        }
        System.out.println("The word " + key + " occurred " + count + " times");
    }
}
