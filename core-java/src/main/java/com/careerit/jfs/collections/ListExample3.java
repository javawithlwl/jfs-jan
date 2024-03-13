package com.careerit.jfs.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Krish");
        list1.add("Manoj");
        list1.add("John");
        List<String> list2 = new ArrayList<>();
        list2.add("Krish");
        list2.add("Charan");
        list2.add("Haadya");
        list2.add("Suma");

        List<String> list3 = new ArrayList<>(list1);

        for(String name:list2){
            if(!list3.contains(name)){
                list3.add(name);
            }
        }
        System.out.println(list3);
    }
}
