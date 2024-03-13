package com.careerit.jfs.oop.statickeyword;
import static com.careerit.jfs.oop.statickeyword.SimpleClsOne.*;
import static com.careerit.jfs.oop.statickeyword.SimpleClsTwo.*;
class SimpleClsOne{
    public static void show1(){
        System.out.println("Show method called");
    }
    public static void show2(){
        System.out.println("Show method called");
    }
    public static void show3(){
        System.out.println("Show method called");
    }

}
class SimpleClsTwo{
    public static void show1(){
        System.out.println("Show method called");
    }
    public static void show4(){
        System.out.println("Show method called");
    }
}
public class StaticImportExample3 {

    public static void main(String[] args) {

            SimpleClsTwo.show1();
            show3();
            show2();
            SimpleClsOne.show1();
            show4();
    }
}
