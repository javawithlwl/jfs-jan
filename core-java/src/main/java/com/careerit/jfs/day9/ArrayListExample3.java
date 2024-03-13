package com.careerit.jfs.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayListExample3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        while(list.size() <= 30) {
            int num = ThreadLocalRandom.current().nextInt(1, 101);
            if(!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
