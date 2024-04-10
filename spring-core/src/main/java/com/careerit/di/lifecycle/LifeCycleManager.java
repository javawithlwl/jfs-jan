package com.careerit.di.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.di.lifecycle")
public class LifeCycleManager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleManager.class);
        DbConnection dbConnection = context.getBean(DbConnection.class);
        System.out.println(dbConnection.getConnectionInfo());

        S3Connection s3Connection = context.getBean(S3Connection.class);

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.showEmployees();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
