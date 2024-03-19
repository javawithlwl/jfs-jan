package com.careerit.iplstats.migrate;

import lombok.Data;

@Data
public class PlayerDto {
    private String name;
    private String role;
    private String teamName;
    private double amount;
}
