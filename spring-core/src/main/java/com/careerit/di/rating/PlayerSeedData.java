package com.careerit.di.rating;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PlayerSeedData {
    public List<Player> getPlayers() {
       List<Player> players = List.of(
                  new Player("Virat Kohli", "Batsman", "India"),
                    new Player("Rohit Sharma", "Batsman", "India"),
                    new Player("Jasprit Bumrah", "Bowler", "India"),
                    new Player("Kane Williamson", "Batsman", "New Zealand"),
                    new Player("Trent Boult", "Bowler", "New Zealand"),
                    new Player("Steve Smith", "Batsman", "Australia"),
                    new Player("David Warner", "Batsman", "Australia"),
                    new Player("Pat Cummins", "Bowler", "Australia"),
                    new Player("Joe Root", "Batsman", "England"),
                    new Player("Jofra Archer", "Bowler", "England"),
                    new Player("Ben Stokes", "All Rounder", "England"),
                    new Player("Shakib Al Hasan", "All Rounder", "Bangladesh"),
                    new Player("Mushfiqur Rahim", "Batsman", "Bangladesh"),
                    new Player("Mustafizur Rahman", "Bowler", "Bangladesh")
        );
        return players;
    }
}
