package com.careerit.jfs.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample4 {


    public static void main(String[] args) {


        String fileName = "/employees.csv";
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(ExceptionExample4.class.getResource(fileName).getPath());
            br = new BufferedReader(fr);
            String str = null;
            int count  = 0;
            while((str = br.readLine()) != null){
                System.out.println(str);
                count++;
                if(count == 1){
                    continue;
                }
                String[] arr = str.split(",");
                String name = arr[0];
                System.out.println(name.substring(0, 3).toUpperCase());

            }

        }catch (FileNotFoundException e){
            System.out.println("File not found: "+fileName);
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("While reading the file: "+fileName);
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Data is not in expected format");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("While processing the file: "+fileName);
            e.printStackTrace();
        }finally{
            try {
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
                System.out.println("File closing is done");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
