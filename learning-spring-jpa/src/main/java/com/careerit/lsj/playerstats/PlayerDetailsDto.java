package com.careerit.lsj.playerstats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PlayerDetailsDto {

    private UUID id;
    private String name;
    private String role;
    private String country;
    private String team;
    private double amount;

}
