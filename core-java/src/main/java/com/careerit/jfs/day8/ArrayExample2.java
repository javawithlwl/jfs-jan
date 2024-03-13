package com.careerit.jfs.day8;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {

        String[] names1 = {"Krish", "Manoj", "Rajesh", "Manoj", "Suresh", "Krish", "Rajesh", "Charan", "Manoj"};
        String[] uniqueNames = getUniqueNames(names1);
        System.out.println("Unique names are :");
        for(String name:uniqueNames){
            System.out.println(name);
        }

    }

    private static String[] getUniqueNames(String[] names) {
        String[] uniqueNames = new String[names.length];
        int count = 0;
        for(String name:names){
            if(!isPresent(uniqueNames,name)){
                uniqueNames[count++] = name;
            }
        }
        String[] arr = new String[count];
        System.arraycopy(uniqueNames,0,arr,0,count);
        return arr;
    }
    private static boolean isPresent(String[] arr,String ele){
        for(String name:arr){
            if(name!=null && name.equals(ele)){
                return true;
            }
        }
        return false;
    }
}
