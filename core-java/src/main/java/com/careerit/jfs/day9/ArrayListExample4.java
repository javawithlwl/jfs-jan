package com.careerit.jfs.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Krish");
        names.add("Manoj");
        names.add("Charan");
        names.add("Ramesh");
        names.add("Krish");
        names.add("Manoj");
        names.add("Balu");

        // Find the unique elements from the list and store it in a new list

        List<String> uniqueNames = new ArrayList<>();
        for(String name:names){
            if(!uniqueNames.contains(name)){
                uniqueNames.add(name);
            }
        }
        System.out.println(uniqueNames);
    }
}
