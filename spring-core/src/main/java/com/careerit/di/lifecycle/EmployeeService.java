package com.careerit.di.lifecycle;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
public class EmployeeService {



    private List<Employee> empList;

    public void showEmployees(){
        empList.forEach(System.out::println);
    }

    @PostConstruct
    public void init(){
        empList = List.of(
                Employee.builder().id(1).name("Krish").mobile("9876543210").build(),
                Employee.builder().id(2).name("Manoj").mobile("9876543211").build(),
                Employee.builder().id(3).name("Charan").mobile("9876543212").build(),
                Employee.builder().id(4).name("Rajesh").mobile("9876543213").build()
        );
    }

    @PreDestroy
    public void clear(){
        System.out.println("Clearing the employee list");
        if(empList != null){
           empList = null;
        }
    }
}
