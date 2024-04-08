package com.careerit.di.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.di.ex")
public class UserDataManager {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(UserDataManager.class);
        UserDataController controller = context.getBean("userDataController", UserDataController.class);
        System.out.println(controller.dbVersion());
    }
}
