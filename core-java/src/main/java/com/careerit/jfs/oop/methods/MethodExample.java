package com.careerit.jfs.oop.methods;

import java.time.LocalDateTime;

public class MethodExample {

        public static int maxElement(int[] arr){
            int max = arr[0];
            for(int ele:arr){
                if(ele > max){
                    max = ele;
                }
            }
            return max;
        }

        public static void showGreetings(String name){
            System.out.println("Hello "+name+", Welcome to the world of Java");
        }

        public static LocalDateTime getSystemDateTime(){
            return LocalDateTime.now();
        }

        public static void showSystemInfo(){
            System.out.println("OS : "+System.getProperty("os.name"));
            System.out.println("OS Version : "+System.getProperty("os.version"));
            System.out.println("OS Architecture : "+System.getProperty("os.arch"));
            System.out.println("Java Version : "+System.getProperty("java.version"));
            System.out.println("Java Vendor : "+System.getProperty("java.vendor"));
        }


}
