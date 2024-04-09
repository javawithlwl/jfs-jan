package com.careerit.di.rating;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class PlayerRatingService {

        private final PlayerSeedData playerSeedData;

        public List<PlayerRating> getPlayersRating(){
            List<Player> players = playerSeedData.getPlayers();
            List<PlayerRating> playerRatings = new ArrayList<>();
            for(Player player: players){
                int rating = (int)(Math.random()*10)+1;
                PlayerRating playerRating = new PlayerRating(player.name(), rating);
                playerRatings.add(playerRating);
            }
            return playerRatings;
        }
}
