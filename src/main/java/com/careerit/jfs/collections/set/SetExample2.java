package com.careerit.jfs.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample2 {

    public static void main(String[] args) {

        List<String> cs = List.of("Krish", "Manoj", "John", "Smith", "Krish");
        List<String> is = List.of("Krish", "Manoj", "Haadya", "Anusha", "Krish");
        List<String> ec = List.of("Krish", "Manoj", "Raju", "Smith", "Krish");

        Set<String> uniqueNames = new HashSet<>(cs);
        uniqueNames.addAll(is);
        uniqueNames.addAll(ec);

        System.out.println(uniqueNames);

    }
}
