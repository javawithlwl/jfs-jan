package com.careerit.jfs.iplcorestats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public final class PlayerDataReaderUtil {
    private PlayerDataReaderUtil() {
    }

    public static List<Player> loadPlayersData() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(
                    PlayerDataReaderUtil.class.getResource("/players_data.json"),
                    new TypeReference<List<Player>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Error while loading player data " + e);
        }
    }
}
