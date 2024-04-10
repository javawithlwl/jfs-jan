package com.careerit.di.circular;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.di.circular")
public class Manager {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Manager.class);
        InvoiceMgr invoiceMgr = context.getBean(InvoiceMgr.class);
        invoiceMgr.showInvoiceDetails();
    }
}
