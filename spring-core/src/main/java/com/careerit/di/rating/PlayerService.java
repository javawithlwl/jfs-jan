package com.careerit.di.rating;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PlayerService {

        private final PlayerSeedData playerSeedData;
        private final PlayerRatingService playerRatingService;

        public List<PlayerWithRating> getPlayersWithRating(){
            List<Player> players = playerSeedData.getPlayers();
            List<PlayerRating> playerRatings = playerRatingService.getPlayersRating();
            Map<String,Player> playerMap = players.stream().collect(Collectors.toMap(Player::name, Function.identity()));
            Map<String,PlayerRating> playerRatingMap = playerRatings.stream().collect(Collectors.toMap(PlayerRating::name, Function.identity()));
            List<PlayerWithRating> playerWithRatings = new ArrayList<>();
            for(Player player: players){
                PlayerRating playerRating = playerRatingMap.get(player.name());
                PlayerWithRating playerWithRating = new PlayerWithRating(player.name(), player.role(), player.country(), playerRating.rating());
                playerWithRatings.add(playerWithRating);
            }
            return playerWithRatings;
        }
}
