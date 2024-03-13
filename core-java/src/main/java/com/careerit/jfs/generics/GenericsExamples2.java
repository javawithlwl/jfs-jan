package com.careerit.jfs.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExamples2 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Krish");
        names.add("Manoj");
        names.add("Charan");

        for(String name:names) {
            System.out.println(name.toUpperCase());
        }
    }
}
