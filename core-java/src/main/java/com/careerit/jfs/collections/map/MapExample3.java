package com.careerit.jfs.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample3 {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Krish", 23);
        map.put("Manoj", 24);
        map.put("John", 30);
        map.put("Smith", 31);
        Set<String> keys = map.keySet();
        for(String key: keys) {
            System.out.println(key+" : "+map.get(key));
        }
        Collection<Integer> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry: entrySet) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
        map.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
