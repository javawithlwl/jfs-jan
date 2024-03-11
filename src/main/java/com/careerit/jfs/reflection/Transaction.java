package com.careerit.jfs.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private String transId;
    private String fromMobile;
    private String toMobile;
    private double amount;
    private Status status;
}
