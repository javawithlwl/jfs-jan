package com.careerit.di.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeManager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfiguration.class);
        EmployeeService service = context.getBean("employeeService", EmployeeService.class);
        service.searchName("Krish");
        service.searchName("Krishna");
    }
}
