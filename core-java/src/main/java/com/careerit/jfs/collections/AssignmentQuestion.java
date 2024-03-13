package com.careerit.jfs.collections;

import java.util.List;

public class AssignmentQuestion {

    public static void main(String[] args) {
        List<Integer> list = getRandomNumbers(10, 10, 50);
        System.out.println(list);
        List<String> list1 = List.of("Krish", "Manoj", "John", "Smith", "Krish");
        List<String> list2 = List.of("Krish", "Charan", "Haadya", "Suma");
        List<String> duplicateNames = getDuplicateNames(list1, list2);
        System.out.println(duplicateNames);
        List<String> uniqueNames = getUniqueNames(list1, list2);
        System.out.println(uniqueNames);
    }


    // Generate the n random numbers in the range of lb and ub and store random number into list
    // Note: ensure that values in the list should not be repeated
    public static List<Integer> getRandomNumbers(int n,int lb,int ub){
        return null;
    }

    public static List<String> getDuplicateNames(List<String> list1, List<String> list2){
        return null;
    }

    public static List<String> getUniqueNames(List<String> list1, List<String> list2){
        return null;
    }
}
