package com.careerit.jfs.collections.properties;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tenant {
    private String name;
    private String email;
    private String city;
    private Address address;
}
