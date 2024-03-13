package com.careerit.jfs.oop.abstractexample;

abstract class One{
    One(){
        super();
    }
}
abstract class Two extends One{
    Two(){
        super();
    }
}
class Three extends  Two{
    Three(){
        super();
    }
}
public class AbstractClassWithConstructors {

    public static void main(String[] args) {

            One obj = new Three();
    }
}
