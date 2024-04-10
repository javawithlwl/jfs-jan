package com.careerit.di.circular;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceItemMgr {


    private final InvoiceUtil invoiceUtil;
    public List<List<Object>> getInvoiceItems() {
        return List.of(List.of("item1", 1000.0), List.of("item2", 2000.0));
    }

    public void showInvoiceItems() {
        System.out.println("Items : " + getInvoiceItems());
        System.out.println("Total amount: " + invoiceUtil.getTotalAmount(getInvoiceItems()));
    }



}
