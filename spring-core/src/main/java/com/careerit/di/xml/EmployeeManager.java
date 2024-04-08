package com.careerit.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeManager {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/emp-bean-xml-config.xml");
        EmployeeService service = context.getBean("employeeService", EmployeeService.class);
        service.searchName("Krish");
        service.searchName("Krishna");
    }
}
