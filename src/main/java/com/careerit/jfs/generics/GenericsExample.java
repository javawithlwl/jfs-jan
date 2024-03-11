package com.careerit.jfs.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

            List list = new ArrayList();
            list.add(10);
            list.add("Hello");
            list.add(10.5);
            list.add(true);
            list.add(new Object());
            list.add("Java");
            list.add(".Net");

            for(Object obj:list) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    System.out.println(str.toUpperCase());
                }
            }

    }
}
