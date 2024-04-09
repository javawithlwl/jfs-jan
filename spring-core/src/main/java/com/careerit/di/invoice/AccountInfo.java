package com.careerit.di.invoice;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AccountInfo {

        private long accountNumber;
        private String name;
        private String city;
}
