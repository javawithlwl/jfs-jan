package com.careerit.jfs.exceptions;

import java.io.Closeable;
import java.io.IOException;

class MyFileReader implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("File is closed");
    }
}

public class ExceptionExample6 {

    public static void main(String[] args) {

        try(MyFileReader fr = new MyFileReader()){
            System.out.println("File processing is done");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
