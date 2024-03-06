package com.careerit.jfs.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Krish");
        set.add("Manoj");
        set.add("John");
        set.add("Smith");
        set.add("Krish");
        System.out.println(set);

        // set will check the hashcode and equals method to check the duplicate

        for(String ele: set) {
            System.out.println(ele);
        }
        set.forEach(System.out::println);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String ele = iterator.next();
            System.out.println(ele);
        }

    }
}
