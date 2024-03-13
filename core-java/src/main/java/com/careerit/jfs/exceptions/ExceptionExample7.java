package com.careerit.jfs.exceptions;
class C1Exception extends Exception{
    public C1Exception(String message){
        super(message);
    }
}
class C2Exception extends C1Exception{
    public C2Exception(String message){
        super(message);
    }
}
class C3Exception extends C2Exception{
    public C3Exception(String message){
        super(message);
    }
}
class C4Exception extends Exception{
    public C4Exception(String message){
        super(message);
    }
}

class C1{

    public void m1() throws C2Exception{
        System.out.println("C1 m1 method");
    }
}
class C2 extends C1{

    @Override
    public void m1()throws C3Exception{
        System.out.println("C2 m2 method");
    }
}

public class ExceptionExample7 {
}
