package com.careerit.jfs.collections.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    private String role;
    private String country;
    private String team;
    private double amount;
}
