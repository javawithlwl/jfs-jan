package com.careerit.jfs.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ExceptionExample3 {

    public static void main(String[] args) {

        // Read data from file employees.csv and display name in upper case (first 4 characters)

        String fileName = "employees.csv";
        try{
           List<String> list = Files.readAllLines(
                    Path.of(ExceptionExample2.class.getResource("/" + fileName).getPath()));

           for(int i=1;i< list.size();i++){
                String[] arr = list.get(i).split(",");
                String name = arr[0].trim().substring(0, 4).toUpperCase();
                System.out.println(name.toUpperCase());
           }
        }catch (IOException e){
            System.out.println("While reading the file: "+fileName);
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Data is not in expected format");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("While processing the file: "+fileName);
            e.printStackTrace();
        }






    }


}
