package com.careerit.jfs.oop.override;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Transaction {
    private long transId;
    private String fromMobile;
    private String toMobile;
    private double amount;
    private TxnStatus status;
    private LocalDateTime dateTime;

}
