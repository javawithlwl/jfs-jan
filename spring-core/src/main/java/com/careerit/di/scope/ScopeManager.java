package com.careerit.di.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.di.scope")
public class ScopeManager {

    public static void main(String[] args) {

        ApplicationContext context1 = new AnnotationConfigApplicationContext(ScopeManager.class);

        BillingService billingService1 = context1.getBean(BillingService.class);
        AdminService adminService1 = context1.getBean(AdminService.class);
        InvoiceService invoiceService1 = context1.getBean(InvoiceService.class);

        billingService1.showInvoiceDetails();
        adminService1.showInvoiceDetails();
        invoiceService1.showInvoiceDetails();



    }
}
