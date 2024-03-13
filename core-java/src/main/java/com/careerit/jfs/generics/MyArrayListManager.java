package com.careerit.jfs.generics;

import java.util.ArrayList;
import java.util.List;

class MyArrayList<T extends Number>{

    List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }
    public T get(int index) {
        return list.get(index);
    }
    public List<T> getAll(){
        return list;
    }

}

public class MyArrayListManager {

    public static void main(String[] args) {

            MyArrayList<Double> obj = new MyArrayList<>();
            obj.add(10.50);
            obj.add(20.50);
            System.out.println(obj.get(0));
            System.out.println(obj.getAll());
    }
}
