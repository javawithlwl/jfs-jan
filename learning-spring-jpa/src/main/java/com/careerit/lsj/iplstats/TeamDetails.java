package com.careerit.lsj.iplstats;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "team_details")
@Getter
@Setter
public class TeamDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teamName;
    @OneToMany(mappedBy = "teamDetails")
    private List<Player> players;
}
