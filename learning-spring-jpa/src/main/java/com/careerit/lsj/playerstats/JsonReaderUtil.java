package com.careerit.lsj.playerstats;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonReaderUtil {
    public static List<PlayerDetailsDto> readJsonFile(String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(JsonReaderUtil.class.getResourceAsStream(fileName), new TypeReference<List<PlayerDetailsDto>>() {
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
