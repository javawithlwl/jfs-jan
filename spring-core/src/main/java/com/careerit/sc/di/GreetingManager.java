package com.careerit.sc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingManager {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/greetings.xml");
        GreetingService service = context.getBean("greetings", GreetingService.class);
        System.out.println(service.greet("Krish"));

    }
}
