package com.careerit.jfs.collections;

import java.util.ArrayList;
import java.util.List;

public class AssignmentQuestionWithList {

    List<Integer> list = getRandomNumbers(20, 10, 50);

    public List<Integer> getAllEvenNumbers(){
        return null;
    }
    public List<Integer> getAllNumbersDivisibleBy(int num){
        return null;
    }
    public List<Integer> getAllNumbersDivisibleBy(int num1,int num2){
        return null;
    }
    public List<Integer> getEvenNumberByDoublingTheValue(){
        return null;
    }
    public List<Integer> getEvenNumbersBetween(int lb,int ub){
        return null;
    }
    public List<Integer> getRandomNumbers(int n, int lb, int ub) {
        List<Integer> list = new ArrayList<>();
        while (list.size() != n) {
            int num = (int) (Math.random() * (ub - lb + 1) + lb);
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        return list;
    }



    public static void main(String[] args) {

    }
}
