package com.careerit.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.di.javaconfig")
public class EmpConfiguration {


        @Bean
        public BinarySearch binarySearch(){
            return new BinarySearch();
        }

        @Bean
        public LinearSearch linearSearch(){
            return new LinearSearch();
        }
        @Bean
        public EmployeeService employeeService(){
            return new EmployeeService(binarySearch());
        }

}
