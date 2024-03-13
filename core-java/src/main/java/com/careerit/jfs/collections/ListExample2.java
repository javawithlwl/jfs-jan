package com.careerit.jfs.collections;

import java.util.ArrayList;
import java.util.List;

record Employee(String name, int age) {
}
public class ListExample2 {


    public static void main(String[] args) {
            String data = "Krish-25,Manoj-30,John-35,Smith-40,Charan-42";
            List<Employee> employees = convertToEmployee(data);
            System.out.println(employees);
    }

    public static List<Employee> convertToEmployee(String data){
        String[] arr = data.split(",");
        List<Employee> employees = new ArrayList<>();
        for(String emp:arr){
            String[] empArr = emp.split("-");
            String name = empArr[0];
            int age = Integer.parseInt(empArr[1]);
            employees.add(new Employee(name,age));
        }
        return employees;
    }


}
