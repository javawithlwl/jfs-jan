package com.careerit.di.circular;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceUtil {

        public double getTotalAmount(List<List<Object>> invoiceItems) {
            return invoiceItems.stream().mapToDouble(list -> (double) list.get(1)).sum();
        }
}
