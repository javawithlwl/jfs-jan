package com.careerit.iplstats.domain;

import lombok.Data;

@Data
public class Player {
        private long id;
        private String name;
        private String role;
        private String teamName;
        private double amount;
}
