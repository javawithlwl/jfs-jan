package com.careerit.di.circular;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceMgr {

        private final AddressMgr addressMgr;
        private final ContactMgr contactMgr;
        private final InvoiceItemMgr invoiceItemMgr;
        private final InvoiceUtil invoiceUtil;


        public void showInvoiceDetails(){
                System.out.println("Contact : "+contactMgr.getContact());
                System.out.println("Address : "+addressMgr.getAddress());
                 System.out.println("Items : "+invoiceItemMgr.getInvoiceItems());
        }

        public double getTotalAmount(){
                return invoiceUtil.getTotalAmount(invoiceItemMgr.getInvoiceItems());
        }
}
