package com.careerit.jfs.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample4 {

    public static void main(String[] args) {

        List<String> list = List.of("Krish", "Manoj", "John");

        // by using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // by using for each loop
        for (String name : list) {
            System.out.println(name);
        }

        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numList.add(i);
        }

        for (int i = numList.size() - 1; i >= numList.size() - 5; i--) {
            System.out.println(numList.get(i));
        }

        for (int i = 2; i < numList.size() - 2; i++) {
            System.out.println(numList.get(i));
        }

        // process all the elements in the list using for loop
        numList.forEach(System.out::println);

        // Double the only even number in the list and print the doubled value, otherwise print the number as it is

        numList.forEach(ele->{
            if(ele % 2 == 0){
                System.out.println(ele*2);
            }else {
                System.out.println(ele);
            }
        });

        Iterator<Integer> itr = numList.iterator();
        while(itr.hasNext()){
            int ele = itr.next();
            if(ele == 15 ){
                break;
            }
            System.out.println(ele);
        }
        System.out.println("After break statement");
        itr.forEachRemaining(System.out::println);

        List<Integer> list3 = new ArrayList<>(List.of(10,20,30,40,50));
        ListIterator<Integer> listItr = list3.listIterator();
        while(listItr.hasNext()){
            int ele = listItr.next();
            if(ele == 30){
                listItr.add(35);
            }
            if(ele == 40){
                listItr.set(45);
            }
            System.out.println(ele);
        }
        System.out.println("Reverse order");
        while(listItr.hasPrevious()){
            int ele = listItr.previous();
            System.out.println(ele);
        }

        System.out.println(list3);

    }
}
