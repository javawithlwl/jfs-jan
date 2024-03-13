package com.careerit.jfs.day13;

public class VarargsVariablesExample {


    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int add(int a, int b, int... arr){
        int sum = a + b;
        for(int ele:arr){
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarargsVariablesExample obj = new VarargsVariablesExample();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
    }
}
