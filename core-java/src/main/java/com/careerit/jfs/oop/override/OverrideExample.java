package com.careerit.jfs.oop.override;

import java.io.FileNotFoundException;

class One{
    void show(){
        System.out.println("One");
    }
    String biggest(int a, int b)throws FileNotFoundException {
        return "" + (a > b ? a : b);
    }
}
class Two extends  One{

    protected void show(){
        System.out.println("Two");
    }
    @Override
    String biggest(int a, int b)throws FileNotFoundException {
       if(a > b) {
           return "A is biggest ";
       }else{
           return "B is biggest ";
       }
    }
}
public class OverrideExample {
}
