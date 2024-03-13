package com.careerit.jfs.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Manoj");
        list.add("Charan");
        list.add("Ramesh");
        System.out.println(list);
        System.out.println(list.size());
        list.remove("Manoj");
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Krish"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String name : list) {
            System.out.println(name);
        }
    }
}
