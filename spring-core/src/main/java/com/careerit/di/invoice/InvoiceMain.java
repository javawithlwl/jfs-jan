package com.careerit.di.invoice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.di.invoice")
public class InvoiceMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(InvoiceMain.class);
        InvoiceService invoiceService = context.getBean("invoiceService", InvoiceService.class);
        invoiceService.showInvoiceAmountForAllAccounts();
    }
}
