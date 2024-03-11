package com.careerit.jfs.reflection;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CountryInfo {
    private String name;
    private long population;
    private String currency;
}
