package com.careerit.jfs.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Krish", 23);
        map.put("Manoj", 24);
        map.put("John", 30);
        map.put("Smith", 31);
        map.put("Krish", 29);
        System.out.println(map);
        System.out.println(map.get("Krish"));
        System.out.println(map.get("Rajesh"));

        map.putIfAbsent("Charan", 42);
        System.out.println(map);

        if(map.get("John") != null){
            map.put("John", map.get("John")+2);
        }

        System.out.println(map);

    }
}
