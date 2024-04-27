package com.careerit.lsj.iplstats;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "player")
@Getter
@Setter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private String country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private TeamDetails teamDetails;
    @OneToMany(mappedBy = "player")
    private List<Rating> ratings;


}
