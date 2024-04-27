package com.careerit.lsj.playerstats;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ConvertorUtil {


        public static List<PlayerDetailsDto> toDto(List<PlayerDetails> playerDetails) {
            return playerDetails.stream().map(ConvertorUtil::toDto).toList();
        }

        public static List<PlayerDetails> toEntity(List<PlayerDetailsDto> playerDetails) {
            return playerDetails.stream().map(ConvertorUtil::toEntity).toList();
        }

        public static PlayerDetailsDto toDto(PlayerDetails playerDetails) {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.convertValue(playerDetails, PlayerDetailsDto.class);
        }

        public static PlayerDetails toEntity(PlayerDetailsDto playerDetails) {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.convertValue(playerDetails, PlayerDetails.class);
        }

}
