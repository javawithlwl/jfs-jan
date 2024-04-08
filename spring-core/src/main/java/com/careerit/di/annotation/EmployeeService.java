package com.careerit.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

        String[] names = {"Krish","Manoj","Charan","Sai","Rajesh","Suresh"};
        private SearchingTechnique searchingTechnique;

        @Autowired
        EmployeeService(@Qualifier("linearSearch") SearchingTechnique searchingTechnique){
            this.searchingTechnique = searchingTechnique;
        }
        public void searchName(String name){
           int index = searchingTechnique.search(names, name);
              if(index == -1) {
                      System.out.println("Name : " + name + " not found");
              }else {
                      System.out.println("Name : " + name + " found at index : "+index);
              }
        }
}
