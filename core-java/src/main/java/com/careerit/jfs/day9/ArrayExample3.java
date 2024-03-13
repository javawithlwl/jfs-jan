package com.careerit.jfs.day9;
public class ArrayExample3 {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(3);
        myArray.add(100);
        myArray.add(200);
        myArray.add(300);
        myArray.add(400);
        myArray.add(500);
        myArray.add(600);
        myArray.add(700);
        myArray.showElements();
        myArray.delete(300);
        myArray.showElements();
    }
}
