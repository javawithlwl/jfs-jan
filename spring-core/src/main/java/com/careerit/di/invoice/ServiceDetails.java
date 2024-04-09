package com.careerit.di.invoice;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ServiceDetails {

    private long id;
    private String name;
    private double amount;
}
