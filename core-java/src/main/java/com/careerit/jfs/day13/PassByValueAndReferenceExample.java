package com.careerit.jfs.day13;
import java.util.ArrayList;
import java.util.List;

public class PassByValueAndReferenceExample {
    public static void checkAndAddBoyNames(List<String> uniques, List<String> boys) {
            for(String name:boys){
                if(!uniques.contains(name)){
                    uniques.add(name);
                }
            }
    }
    public static void checkAndAddGirlNames(List<String> uniques, List<String> girls) {
           for(String name:girls){
                if(!uniques.contains(name)){
                    uniques.add(name);
                }
           }
    }

    public static void main(String[] args) {

            List<String> uniqueNames = new ArrayList<>();
            uniqueNames.add("Krish");
            uniqueNames.add("Manoj");
            uniqueNames.add("Tanvi");

            List<String> boysNames = List.of("Krish","Manoj","John","Smith");
            List<String> girlsNames = List.of("Tanvi","Dhanvi","Aadhya","Deepya");
            System.out.println("Before adding :"+uniqueNames);
            checkAndAddBoyNames(uniqueNames, boysNames);
            checkAndAddGirlNames(uniqueNames, girlsNames);
            System.out.println("After adding :"+uniqueNames);

    }
}
