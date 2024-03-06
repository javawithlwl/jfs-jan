package com.careerit.jfs.collections.properties;



import lombok.Data;

import java.util.List;

@Data
class Player{
    private String name;
    private String role;
    private String team;
    private double amount;
    private String country;
}
public class AssignmentQuestionYaml {

    public static void main(String[] args) {
        List<Player> players = getPlayerDetails();
        players.forEach(System.out::println);

    }

    public static List<Player> getPlayerDetails(){
        // Read the players.yaml file and return the list of players
        return null;
    }
}
