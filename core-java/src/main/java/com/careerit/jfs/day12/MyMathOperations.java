package com.careerit.jfs.day12;

import java.time.LocalDate;

public class MyMathOperations {

    public static int biggest(int a, int b, int c) {
        return a > b && a > c ? a : Math.max(b, c);
    }

    public int gcdOf(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        return a;
    }

    public void showGreetings(String name) {
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }
        System.out.println("Hello " + name + ", Good Morning!");
    }

    public static String getOsName() {
        return System.getProperty("os.name");
    }

    public static void showSystemDateTime() {
        System.out.println("Current date and time : "+ LocalDate.now());
    }


}
