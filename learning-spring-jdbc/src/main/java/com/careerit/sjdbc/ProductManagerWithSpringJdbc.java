package com.careerit.sjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sjdbc")
public class ProductManagerWithSpringJdbc {

    public static void main(String[] args) {
        System.out.println("Product details using spring jdbc");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProductManagerWithSpringJdbc.class);
        ProductDao productDao = context.getBean(ProductDao.class);
        productDao.showProducts();
        productDao.showProductCount();
    }
}
