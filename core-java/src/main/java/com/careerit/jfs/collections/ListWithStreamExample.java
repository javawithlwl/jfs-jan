package com.careerit.jfs.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListWithStreamExample {


    public static void main(String[] args) {

        List<Integer> list = getRandomNumbers(20);
        System.out.println(list);
        // double the each number from list and store into another list

        List<Integer> doubleList = new ArrayList<>();
        for(int ele:list){
            doubleList.add(ele*2);
        }
        System.out.println(doubleList);

        List<Integer> dlist = list
                .stream()
                .map(e -> e * 2).toList();
        System.out.println(dlist);


        // get the even numbers from the list and store into another list

        List<Integer> evenList = new ArrayList<>();
        for(int ele:list){
            if(ele % 2 == 0){
                evenList.add(ele);
            }
        }
        List<Integer> elist = list.stream()
                .filter(ele-> ele > 20 && ele < 40)
                .collect(Collectors.toList());
        System.out.println(elist);

        // get the odd numbers from the list, increment number by one and store into another list

        List<Integer> oddList = new ArrayList<>();
        for(int ele:list){
            if(ele % 2 != 0){
                oddList.add(ele+1);
            }
        }

        List<Integer> olist = list
                .stream()
                .filter(getOddPredicate())
                .map(e -> e + 1)
                .toList();

        List<String> names = List.of("Krish", "Manoj", "John", "Smith", "Krish");
        // Get the name length and store into another list

        List<Integer> nameLengthList = new ArrayList<>();
        for(String name:names){
            nameLengthList.add(name.length());
        }

        List<Integer> nlist = names.stream()
                .map(e->e.length())
                .toList();
        System.out.println(nlist);
    }

    public static Predicate<Integer> getOddPredicate(){
        return ele -> ele % 2 != 0;
    }
    public static List<Integer> getRandomNumbers(int n){

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add((int)(Math.random()*100));
        }
        return list;

    }
}
